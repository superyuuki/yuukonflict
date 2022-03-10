package com.superyuuki.yuukonflict.feature.creator.dispatcher;

import com.superyuuki.yuukonflict.feature.Dispatcher;
import com.superyuuki.yuukonflict.model.Event;

class EmptyDispatcher implements Dispatcher {

    final static Dispatcher EMPTY = new EmptyDispatcher();

    @Override
    public void fire(Event event) {

    }
}
