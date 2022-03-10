package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Composable;
import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.newtype.Phase;

import java.util.Optional;

public interface GameController extends Dispatcher {

    Optional<Game> getGame(long id);
    long make(Phase phase);

}
