package com.superyuuki.yuukonflict.feature;

public interface Conduit extends Dispatcher {

    void enact(Event in);

}
