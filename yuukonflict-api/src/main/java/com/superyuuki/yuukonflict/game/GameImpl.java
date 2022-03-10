package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.newtype.Phase;

import java.util.Map;
import java.util.Optional;

public class GameImpl implements Game  {

    private final Map<String, Dispatcher> traits;

    public GameImpl(Map<String, Dispatcher> traits) {
        this.traits = traits;
    }

    @Override
    public Dispatcher dispatcher() {
        return event -> {
            for (Dispatcher trait : traits.values()) {
                trait.fire(event);

                if (event.isCancelled()) return;
            }
        };
    }

    @Override
    public void phase(Phase phase) {
        phase.modify(dispatcher(), new TraitChanging() {
            @Override
            public Optional<Dispatcher> child(String key) {
                return Optional.ofNullable(traits.get(key));
            }

            @Override
            public void set(String key, Dispatcher add) {
                traits.put(key, add);
            }
        });
    }

}
