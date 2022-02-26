package com.superyuuki.yuukonflict.feature.factory;

import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.game.Game;
import com.superyuuki.yuukonflict.feature.Features;

import java.util.Map;

public class MyFactory implements Factory {

    private final Features features;
    private final Map<String, TraitConstructor> map;

    public MyFactory(Features features, Map<String, TraitConstructor> map) {
        this.features = features;
        this.map = map;
    }

    @Override
    public Trait of(String type, Game game) {
        var ctor = map.get(type);

        if (ctor == null) throw new IllegalStateException("No such trait exists with id: " + type);

        return ctor.make(features, game);
    }
}
