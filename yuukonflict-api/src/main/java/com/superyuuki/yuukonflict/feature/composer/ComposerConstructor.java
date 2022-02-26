package com.superyuuki.yuukonflict.feature.composer;

import com.superyuuki.yuukonflict.feature.Dispatcher;

public interface ComposerConstructor<T> {

    T make(Dispatcher dispatcher);

}
