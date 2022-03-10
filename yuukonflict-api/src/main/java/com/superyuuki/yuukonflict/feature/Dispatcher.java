package com.superyuuki.yuukonflict.feature;

import com.superyuuki.yuukonflict.model.Event;

public interface Dispatcher {

    void fire(Event event);

}
