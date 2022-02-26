package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Conduit;
import com.superyuuki.yuukonflict.feature.Trait;

public interface CompilerConstructor<T extends Trait> {

    Conduit make(T trait);

}
