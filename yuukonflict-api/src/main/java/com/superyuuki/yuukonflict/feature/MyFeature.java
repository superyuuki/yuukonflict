package com.superyuuki.yuukonflict.feature;

import com.superyuuki.yuukonflict.feature.inbuilt.PhaseTrait;
import com.superyuuki.yuukonflict.game.Game;

/**
 * Will exist as long as it's parent phase is alive
 */
public class MyFeature implements PhaseTrait {

    private final Game game;

    public MyFeature(Game game) {
        this.game = game;
    }

    @Override
    public void phaseStart() {
        System.out.println("HELLO");
    }

    @Override
    public void phaseStop() {
        System.out.println("GOODBYE");
    }
}
