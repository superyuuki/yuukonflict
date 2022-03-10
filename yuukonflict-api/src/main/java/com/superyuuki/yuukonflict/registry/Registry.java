package com.superyuuki.yuukonflict.registry;

import com.superyuuki.yuukonflict.feature.creator.dispatcher.DispatcherFromTrait;
import com.superyuuki.yuukonflict.feature.creator.trait.ComposableFactory;
import com.superyuuki.yuukonflict.feature.creator.trait.TraitFromDispatcher;
import com.superyuuki.yuukonflict.feature.developer.storage.TraitFromConfig;
import com.superyuuki.yuukonflict.model.Trait;
import com.superyuuki.yuukonflict.newtype.subphase.SubphaseConfig;

public interface Registry {

    <T extends Trait> void registerTrait(Class<T> trait, DispatcherFromTrait dft, TraitFromDispatcher<T> tfd);
    <C extends SubphaseConfig> void registerFeature(Class<C> config, TraitFromConfig<C> constructor, String id);

    ComposableFactory build();
}
