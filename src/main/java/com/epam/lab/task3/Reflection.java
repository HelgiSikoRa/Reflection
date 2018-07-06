package com.epam.lab.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

class Reflection {
    private final static Logger LOG = LogManager.getLogger(Reflection.class);

    void printAnnotationValue(Object object) {
        Class classInstance = object.getClass();
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(CustomAnnotation.class)) {
                Annotation annotation = field.getAnnotation(CustomAnnotation.class);
                field.setAccessible(true);
                LOG.info(String.format("Field: %s, %s", field.getName(), annotation.toString()));
            }
        }
    }
}