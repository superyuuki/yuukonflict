package com.superyuuki.yuukonflict;

public class MyMapInstance implements MapInstance {

    private final Loc bottomCorner;
    private final Loc topCorner;

    public MyMapInstance(Loc bottomCorner, Loc topCorner) {
        this.bottomCorner = bottomCorner;
        this.topCorner = topCorner;
    }
}
