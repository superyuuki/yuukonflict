package com.superyuuki.yuukonflict.feature.composer;

import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.feature.Dispatcher;

import java.util.Map;
import java.util.Optional;

public class MyComposer implements Composer {

    private final Map<Class<?>, ComposerConstructor<?>> map;

    public MyComposer(Map<Class<?>, ComposerConstructor<?>> map) {
        this.map = map;
    }

    @Override
    public <T extends Trait> T make(Class<T> type, Dispatcher dispatcher) {
        var ctor = map.get(type);
        if (ctor == null) throw new IllegalStateException("No composer exists for type: " + type.getCanonicalName());

        return type.cast(
                ctor.make(dispatcher)
        );
    }
}
