package com.superyuuki.yuukonflict;

import com.superyuuki.yuukonflict.world.MapInstance;

public class MyMapInstance implements MapInstance {

    private final Loc bottomCorner;
    private final Loc topCorner;

    public MyMapInstance(Loc bottomCorner, Loc topCorner) {
        this.bottomCorner = bottomCorner;
        this.topCorner = topCorner;
    }
}
