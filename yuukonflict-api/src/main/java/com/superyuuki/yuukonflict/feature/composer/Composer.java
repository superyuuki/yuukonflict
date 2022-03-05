package com.superyuuki.yuukonflict.feature.composer;

import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.feature.Dispatcher;

import java.util.Optional;

public interface Composer {

    <T extends Trait> T make(Class<T> type, Dispatcher dispatcher);

}
