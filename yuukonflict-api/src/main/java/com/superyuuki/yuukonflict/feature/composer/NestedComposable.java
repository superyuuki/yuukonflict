package com.superyuuki.yuukonflict.feature.composer;

import com.superyuuki.yuukonflict.feature.Dispatcher;

import java.util.Optional;

public interface NestedComposable extends Composable {

    Optional<Composable> child(String key);

}
