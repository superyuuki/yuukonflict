package com.superyuuki.yuukonflict.feature.example;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.creator.dispatcher.DispatcherFromTrait;
import com.superyuuki.yuukonflict.inbuilt.PhaseTrait;
import com.superyuuki.yuukonflict.model.Trait;

import java.util.Optional;

public class PhaseDispatcherFromTrait implements DispatcherFromTrait {


    @Override
    public Optional<Dispatcher> make(Trait trait) {
        if (trait instanceof PhaseTrait phaseTrait) {
            return Optional.of(e -> {
                if (e instanceof PhaseStartEvent) {
                    phaseTrait.phaseStart();
                } else if (e instanceof PhaseStopEvent) {
                    phaseTrait.phaseStop();
                }
            });
        }

        return Optional.empty();
    }
}
