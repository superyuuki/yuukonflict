package com.superyuuki.yuukonflict.feature.creator.trait;

import com.superyuuki.yuukonflict.feature.Composable;
import com.superyuuki.yuukonflict.feature.Dispatcher;

public interface ComposableFactory {

    Composable of(Dispatcher dispatcher);

}
