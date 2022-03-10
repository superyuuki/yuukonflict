package com.superyuuki.yuukonflict.feature.example;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.inbuilt.PhaseTrait;

public class PhaseTraitFromDispatcher implements PhaseTrait {

    private final Dispatcher dispatcher;

    public PhaseTraitFromDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void phaseStart() {
        dispatcher.fire(new PhaseStartEvent());
    }

    @Override
    public void phaseStop() {
        dispatcher.fire(new PhaseStopEvent());
    }
}
