package com.superyuuki.yuukonflict.feature.creator.dispatcher;

import com.superyuuki.yuukonflict.model.Event;
import com.superyuuki.yuukonflict.feature.Dispatcher;

import java.util.List;

public class CompositeDispatcher implements Dispatcher {

    private final List<Dispatcher> conduits;

    public CompositeDispatcher(List<Dispatcher> conduits) {
        this.conduits = conduits;
    }

    @Override
    public void fire(Event in) {
        for (Dispatcher conduit : conduits) {
            conduit.fire(in);
        }
    }
}
