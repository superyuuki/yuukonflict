package com.superyuuki.yuukonflict.newtype;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.game.TraitChanging;

public interface Phase {

    void modify(Dispatcher dispatcher, TraitChanging changing);

}
