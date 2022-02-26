package com.superyuuki.yuukonflict.game.phase;

import com.superyuuki.yuukonflict.feature.Conduit;
import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.composer.Composer;

import java.util.Map;

public interface Phase {

    void receive(Dispatcher dispatcher, Map<String, Conduit> map);

}
