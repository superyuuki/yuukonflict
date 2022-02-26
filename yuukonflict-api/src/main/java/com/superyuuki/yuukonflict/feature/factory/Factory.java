package com.superyuuki.yuukonflict.feature.factory;

import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.game.Game;

public interface Factory {

    Trait of(String type, Game game);

}
