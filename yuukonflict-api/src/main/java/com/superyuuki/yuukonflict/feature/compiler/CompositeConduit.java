package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Event;

import java.util.List;

public class CompositeConduit implements Dispatcher {

    private final List<Dispatcher> conduits;

    public CompositeConduit(List<Dispatcher> conduits) {
        this.conduits = conduits;
    }

    @Override
    public void fire(Event event) {
        for (Dispatcher conduit : conduits) {
            conduit.fire(event);
        }
    }
}
