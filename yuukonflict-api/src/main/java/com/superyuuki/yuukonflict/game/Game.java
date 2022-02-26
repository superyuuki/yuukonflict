package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.game.phase.Phase;

public interface Game extends Dispatcher {

    void nextPhase(Phase phase);

}
