package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.newtype.Phase;

public interface Game extends Dispatcher {

    void phase(Phase phase);

}
