package com.superyuuki.yuukonflict.game.phase;

import com.superyuuki.yuukonflict.feature.Conduit;
import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Features;
import com.superyuuki.yuukonflict.feature.composer.Composer;
import com.superyuuki.yuukonflict.feature.inbuilt.PhaseTrait;

import java.util.Map;

public class ReplacingPhase implements Phase {

    private final Composer composer;

    public ReplacingPhase(Composer composer) {
        this.composer = composer;
    }


    @Override
    public void receive(Dispatcher dispatcher, Map<String, Conduit> map) {

        composer.make(PhaseTrait.class, dispatcher)
                .orElseThrow(() -> new IllegalStateException("No such adapter for PhaseTrait!"))
                .phaseStop();

    }
}
