package com.superyuuki.yuukonflict.feature.inbuilt.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;

public class GameComposer implements GameTrait {

    private final Dispatcher dispatcher;

    public GameComposer(Dispatcher dispatcher1) {
        this.dispatcher = dispatcher1;
    }

    @Override
    public void gameStart() {
        dispatcher.fire(new GameStartEvent());
    }

    @Override
    public void gameStop() {
        dispatcher.fire(new GameStopEvent());
    }
}
