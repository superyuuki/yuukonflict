package com.superyuuki.yuukonflict.feature.example.custom;

import com.superyuuki.yuukonfig.user.ConfComment;
import com.superyuuki.yuukonfig.user.ConfKey;
import com.superyuuki.yuukonflict.inbuilt.PhaseTrait;

public class CustomTrait implements PhaseTrait {

    public interface Config {

        @ConfComment("my damage")
        @ConfKey("damage")
        default int damage() {
            return 5;
        }

    }

    private final Config config;

    public CustomTrait(Config config) {
        this.config = config;
    }

    @Override
    public void phaseStart() {

    }

    @Override
    public void phaseStop() {

    }
}
