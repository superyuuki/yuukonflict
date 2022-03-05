package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Trait;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompositeCompiler implements Compiler {

    private final List<Compiler> compilers;

    public CompositeCompiler(List<Compiler> compilers) {
        this.compilers = compilers;
    }

    @Override
    public Optional<Dispatcher> compile(Trait trait) {

        List<Dispatcher> conduits = new ArrayList<>();

        for (Compiler compiler : compilers) {
            var opt = compiler.compile(trait);

            opt.ifPresent(conduits::add);
        }

        if (conduits.isEmpty()) return Optional.empty();

        return Optional.of(new CompositeConduit(conduits));
    }
}
