package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Conduit;
import com.superyuuki.yuukonflict.feature.Event;

import java.util.List;

public class CompositeConduit implements Conduit {

    private final List<Conduit> conduits;

    public CompositeConduit(List<Conduit> conduits) {
        this.conduits = conduits;
    }

    @Override
    public void enact(Event in) {
        for (Conduit conduit : conduits) {
            conduit.enact(in);
        }
    }
}
