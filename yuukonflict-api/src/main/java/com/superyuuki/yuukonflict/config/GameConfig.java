package com.superyuuki.yuukonflict.config;

import com.superyuuki.yuukonfig.user.ConfComment;
import com.superyuuki.yuukonfig.user.ConfKey;
import com.superyuuki.yuukonfig.user.Section;

import java.util.List;

public interface GameConfig extends Section {

    @ConfComment("Your game definitions")
    @ConfKey("games")
    List<GameSection> games();

    interface GameSection extends Section {

        @ConfComment("id of the game")
        @ConfKey("id")
        String id();

        @ConfComment("phases of the game")
        @ConfKey("phases")
        List<PhaseConfig> phases();

    }

}
