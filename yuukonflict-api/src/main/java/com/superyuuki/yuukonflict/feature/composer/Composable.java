package com.superyuuki.yuukonflict.feature.composer;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Trait;

import java.util.Optional;

public interface Composable extends Dispatcher {

    <T extends Trait> T as(Class<T> type);

}
