package com.superyuuki.yuukonflict.feature.inbuilt.game;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Trait;
import com.superyuuki.yuukonflict.feature.compiler.Compiler;

import java.util.Optional;

public class GameCompiler implements Compiler {

    @Override
    public Optional<Dispatcher> compile(Trait trait) {
        if (trait instanceof GameTrait gameTrait) {
            return Optional.of(in -> {
                if (in instanceof GameStartEvent) {
                    gameTrait.gameStart();
                    return;
                }

                if (in instanceof GameStopEvent) {
                    gameTrait.gameStart();
                }
            });
        }

        return Optional.empty();
    }
}
