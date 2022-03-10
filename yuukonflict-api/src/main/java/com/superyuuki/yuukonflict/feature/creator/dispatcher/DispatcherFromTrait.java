package com.superyuuki.yuukonflict.feature.creator.dispatcher;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.model.Trait;

import java.util.Optional;

public interface DispatcherFromTrait {

    Optional<Dispatcher> make(Trait trait);

}
