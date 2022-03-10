package com.superyuuki.yuukonflict.feature;

import com.superyuuki.yuukonflict.model.Trait;

public interface Composable extends Dispatcher {

    <T extends Trait> T of(Class<T> type);

}
