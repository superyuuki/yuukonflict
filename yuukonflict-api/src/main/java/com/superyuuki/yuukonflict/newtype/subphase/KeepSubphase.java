package com.superyuuki.yuukonflict.newtype.subphase;

import com.superyuuki.yuukonflict.create.trait.TraitRegistry;
import com.superyuuki.yuukonflict.inbuilt.PhaseTrait;

public class KeepSubphase implements Subphase {

    private final String id;
    private final TraitRegistry traitRegistry;

    public KeepSubphase(String id, TraitRegistry traitRegistry) {
        this.id = id;
        this.traitRegistry = traitRegistry;
    }


    @Override
    public void modify(GameComposable dispatcher) {
        var opt = dispatcher.child(id);

        if (opt.isPresent()) {
            opt.get().of(PhaseTrait.class).phaseStop();

            return;
        }


    }
}
