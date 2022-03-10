package com.superyuuki.yuukonflict.feature.developer.storage;

import com.superyuuki.yuukonflict.model.Trait;
import com.superyuuki.yuukonflict.newtype.subphase.SubphaseConfig;

public interface TraitFromConfig<T extends SubphaseConfig> {

    Trait supply(T config);

}
