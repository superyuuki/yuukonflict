package com.superyuuki.yuukonflict.newtype;

import com.amihaiemil.eoyaml.YamlNode;
import com.superyuuki.yuukonfig.BadValueException;
import com.superyuuki.yuukonfig.manipulation.Contextual;
import com.superyuuki.yuukonfig.manipulation.Manipulation;
import com.superyuuki.yuukonfig.manipulation.Manipulator;
import com.superyuuki.yuukonfig.manipulation.Priority;

import java.lang.reflect.Type;

public class PhaseManipulator implements Manipulator {

    private final Manipulation manipulation;
    private final Class<?> aClass;
    private final Contextual<Type> ctx;

    public PhaseManipulator(Manipulation manipulation, Class<?> aClass, Contextual<Type> ctx) {
        this.manipulation = manipulation;
        this.aClass = aClass;
        this.ctx = ctx;
    }

    @Override
    public int handles() {
        if (aClass.isAssignableFrom(Phase.class)) {
            return Priority.HANDLE;
        }

        return Priority.DONT_HANDLE;
    }

    @Override
    public Object deserialize(YamlNode yamlNode, String s) throws BadValueException {

        PhaseConfig config = (PhaseConfig) manipulation.deserialize(yamlNode, s, PhaseConfig.class);

        return new CompositePhase(config.subphases());
    }

    @Override
    public YamlNode serializeObject(Object o, String[] strings) {
        return null;
    }

    @Override
    public YamlNode serializeDefault(String[] strings) {
        return null;
    }
}
