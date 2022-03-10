package com.superyuuki.yuukonflict.feature.creator.dispatcher;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.model.Trait;

public interface DispatcherFactory {

    Dispatcher of(Trait trait);

}
