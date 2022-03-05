package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Trait;

import java.util.Optional;

public interface Compiler {

    Optional<Dispatcher> compile(Trait trait);

}
