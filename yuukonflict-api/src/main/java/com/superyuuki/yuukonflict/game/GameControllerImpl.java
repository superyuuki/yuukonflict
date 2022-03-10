package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.model.Event;
import com.superyuuki.yuukonflict.model.GameBound;
import com.superyuuki.yuukonflict.model.Trait;
import com.superyuuki.yuukonflict.newtype.Phase;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GameControllerImpl implements GameController {

    private final Map<Long, Game> games = new HashMap<>();

    @Override
    public Optional<Game> getGame(long id) {
        return Optional.of(games.get(id));
    }

    @Override
    public long make(Phase phase) {
        return 0;
    }

    @Override
    public void fire(Event event) {
        for (Game game : games.values()) {
            game.fire(event);
        }
    }
}
