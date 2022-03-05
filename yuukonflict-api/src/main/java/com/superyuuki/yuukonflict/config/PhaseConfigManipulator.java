package com.superyuuki.yuukonflict.config;

import com.amihaiemil.eoyaml.YamlMapping;
import com.amihaiemil.eoyaml.YamlNode;
import com.superyuuki.yuukonfig.BadValueException;
import com.superyuuki.yuukonfig.manipulation.Contextual;
import com.superyuuki.yuukonfig.manipulation.Manipulation;
import com.superyuuki.yuukonfig.manipulation.Manipulator;
import com.superyuuki.yuukonfig.manipulation.Priority;
import com.superyuuki.yuukonflict.game.phase.Phase;

import java.lang.reflect.Type;

public class PhaseConfigManipulator implements Manipulator {

    private final ConfClasses confClasses;

    private final Manipulation manipulation;
    private final Class<?> aClass;
    private final Contextual<Type> ctx;

    public PhaseConfigManipulator(ConfClasses confClasses, Manipulation manipulation, Class<?> aClass, Contextual<Type> ctx) {
        this.confClasses = confClasses;
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
    public Object deserialize(YamlNode node, String exceptionalKey) throws BadValueException {
        YamlMapping mapping = node.asMapping();
        String id = mapping.value("id").asScalar().value();

        Class<PhaseConfig> opt = confClasses
                .of(id)
                .orElseThrow(
                        () -> new BadValueException(
                                manipulation.configName(),
                                exceptionalKey,
                                "No config section template exists for the phase type: " + id
                        )
                );

        PhaseConfig config = (PhaseConfig) manipulation.deserialize(node, exceptionalKey, opt, ctx);


    }

    @Override
    public YamlNode serializeObject(Object object, String[] comment) {
        throw new UnsupportedOperationException("cannot serialize phases yet!");

    }

    @Override
    public YamlNode serializeDefault(String[] comment) {
        throw new UnsupportedOperationException("cannot serialize phases yet!");
    }
}
