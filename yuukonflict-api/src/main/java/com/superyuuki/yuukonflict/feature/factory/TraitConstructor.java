package com.superyuuki.yuukonflict.feature.factory;

import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.feature.composer.Composable;
import com.superyuuki.yuukonflict.game.Game;
import com.superyuuki.yuukonflict.feature.Features;

public interface TraitConstructor<T> {

    Trait make(Features features, Composable game, T config);

}
