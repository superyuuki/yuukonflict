package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Conduit;
import com.superyuuki.yuukonflict.feature.Trait;

import java.util.Optional;

public interface Compiler {

    Optional<Conduit> compile(Trait trait);

}
