package com.superyuuki.yuukonflict.newtype;

import com.superyuuki.yuukonfig.user.Section;
import com.superyuuki.yuukonflict.newtype.subphase.Subphase;

import java.util.List;

public interface PhaseConfig extends Section {

    List<Subphase> subphases();

}
