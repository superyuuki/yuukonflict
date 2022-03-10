package com.superyuuki.yuukonflict.newtype.register;

import com.superyuuki.yuukonflict.newtype.subphase.SubphaseConfig;

import java.util.Optional;

public interface Configurables {

    Optional<Class<SubphaseConfig>> of(String id);

}
