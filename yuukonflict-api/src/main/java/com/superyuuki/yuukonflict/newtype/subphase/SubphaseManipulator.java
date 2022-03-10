package com.superyuuki.yuukonflict.newtype.subphase;

import com.amihaiemil.eoyaml.YamlNode;
import com.superyuuki.yuukonfig.BadValueException;
import com.superyuuki.yuukonfig.manipulation.Manipulation;
import com.superyuuki.yuukonfig.manipulation.Manipulator;
import com.superyuuki.yuukonfig.manipulation.Priority;
import com.superyuuki.yuukonflict.newtype.register.Configurables;

public class SubphaseManipulator implements Manipulator {

    private final Configurables configurables;
    private final Manipulation manipulation;
    private final Class<?> aClass;

    public SubphaseManipulator(Configurables configurables, Manipulation manipulation, Class<?> aClass) {
        this.configurables = configurables;
        this.manipulation = manipulation;
        this.aClass = aClass;
    }

    @Override
    public int handles() {
        if (aClass.isAssignableFrom(Subphase.class)) {
            return Priority.HANDLE;
        }

        return Priority.DONT_HANDLE;
    }

    @Override
    public Object deserialize(YamlNode yamlNode, String s) throws BadValueException {

        String id = yamlNode.asMapping().string("id");



        return null;
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
