package com.superyuuki.yuukonflict.feature.creator.trait;

import com.superyuuki.yuukonflict.feature.Composable;
import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.model.Event;
import com.superyuuki.yuukonflict.model.Trait;

import java.util.Map;

public class ComposableImpl implements Composable {

    private final Map<Class<?>, TraitFromDispatcher<?>> map;
    private final Dispatcher dispatcher;

    public ComposableImpl(Map<Class<?>, TraitFromDispatcher<?>> map, Dispatcher dispatcher) {
        this.map = map;
        this.dispatcher = dispatcher;
    }

    @Override
    public <T extends Trait> T of(Class<T> type) {
        TraitFromDispatcher<?> tfd = map.get(type);
        if (tfd == null) throw new IllegalStateException("No composer exists for type: " + type.getCanonicalName());

        return type.cast(tfd.make(dispatcher));
    }

    @Override
    public void fire(Event event) {
        dispatcher.fire(event);
    }
}
