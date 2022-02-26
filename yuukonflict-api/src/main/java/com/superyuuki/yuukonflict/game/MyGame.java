package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Conduit;
import com.superyuuki.yuukonflict.feature.Event;
import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.feature.composer.Composer;
import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.game.phase.Phase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MyGame implements Game {

    private final Map<String, Conduit> features = new HashMap<>();

    @Override
    public void nextPhase(Phase phase) {


        //TODO something about assigning pahse features to own features
    }

    @Override
    public void fire(Event event) {
        for (Map.Entry<String, Conduit> entry : features.entrySet()) {
            entry.getValue().enact(event);
        }
    }
}
