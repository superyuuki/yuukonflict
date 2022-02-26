package com.superyuuki.yuukonflict.feature.factory;

import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.game.Game;
import com.superyuuki.yuukonflict.feature.Features;

public interface TraitConstructor {

    Trait make(Features features, Game game);

}
