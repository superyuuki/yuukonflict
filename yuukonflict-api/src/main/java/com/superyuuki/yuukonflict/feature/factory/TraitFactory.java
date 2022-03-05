package com.superyuuki.yuukonflict.feature.factory;

import com.superyuuki.yuukonflict.feature.composer.Composable;

public interface TraitFactory {

    Composable make(String id, Composable game);

}
