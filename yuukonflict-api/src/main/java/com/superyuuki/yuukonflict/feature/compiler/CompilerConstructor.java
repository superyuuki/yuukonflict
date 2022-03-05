package com.superyuuki.yuukonflict.feature.compiler;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.feature.Trait;

public interface CompilerConstructor<T extends Trait> {

    Dispatcher make(T trait);

}
