package com.superyuuki.yuukonflict.feature.creator.trait;

import com.superyuuki.yuukonflict.feature.Dispatcher;

public interface TraitFromDispatcher<T> {

    T make(Dispatcher dispatcher);

}
