package com.superyuuki.yuukonflict.config;

public interface ConfClassesRegistry {

    <T extends PhaseConfig> void register(String id, Class<T> configClass);

    ConfClasses compile();

}
