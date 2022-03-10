package com.superyuuki.yuukonflict.newtype;

import com.superyuuki.yuukonflict.newtype.subphase.Subphase;

import java.util.List;

public class CompositePhase implements Phase {

    private final List<Subphase> subphases;

    public CompositePhase(List<Subphase> subphases) {
        this.subphases = subphases;
    }

    @Override
    public void modify(GameComposable dispatcher) {
        for (Subphase subphase : subphases) {
            subphase.modify(dispatcher);
        }
    }
}
