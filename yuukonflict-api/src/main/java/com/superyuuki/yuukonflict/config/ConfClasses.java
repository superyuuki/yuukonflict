package com.superyuuki.yuukonflict.config;

import java.util.Optional;

public interface ConfClasses {

    <T extends PhaseConfig> Optional<Class<T>> of(String id);
    <T extends PhaseConfig> Optional<String> from(Class<T> clazz);

}
