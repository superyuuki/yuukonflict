package com.superyuuki.yuukonflict.feature.creator.trait;

import com.superyuuki.yuukonflict.feature.Composable;
import com.superyuuki.yuukonflict.feature.Dispatcher;

import java.util.Map;

public class ComposableFactoryImpl implements ComposableFactory {

    private final Map<Class<?>, TraitFromDispatcher<?>> map;

    public ComposableFactoryImpl(Map<Class<?>, TraitFromDispatcher<?>> map) {
        this.map = map;
    }

    @Override
    public Composable of(Dispatcher dispatcher) {
        return new ComposableImpl(map, dispatcher);
    }
}
