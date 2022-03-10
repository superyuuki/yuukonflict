package com.superyuuki.yuukonflict.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;

import java.util.Optional;

public interface TraitChanging {

    Optional<Dispatcher> child(String key);
    void set(String key, Dispatcher add);

}
