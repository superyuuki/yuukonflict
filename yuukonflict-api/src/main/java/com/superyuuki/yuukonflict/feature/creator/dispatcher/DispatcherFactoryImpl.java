package com.superyuuki.yuukonflict.feature.creator.dispatcher;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.model.Trait;

import java.util.ArrayList;
import java.util.List;

public class DispatcherFactoryImpl implements DispatcherFactory {

    private final List<DispatcherFromTrait> dfts;

    public DispatcherFactoryImpl(List<DispatcherFromTrait> dfts) {
        this.dfts = dfts;
    }

    @Override
    public Dispatcher of(Trait trait) {

        List<Dispatcher> dispatchers = new ArrayList<>();

        for (DispatcherFromTrait dft : dfts) {
            dft.make(trait).ifPresent(dispatchers::add);
        }

        if (dispatchers.isEmpty()) return EmptyDispatcher.EMPTY;

        return new CompositeDispatcher(dispatchers);
    }
}
