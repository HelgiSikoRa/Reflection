package com.epam.lab.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

class Reflection {
    private final static Logger LOG = LogManager.getLogger(Reflection.class);

    void printAnnotatedFields(Object object) {
        Class classInstance = object.getClass();
        Field[] fields = classInstance.getDeclaredFields();

        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(CustomAnnotation.class);
            if (annotation == null) {
                continue;
            }
            field.setAccessible(true);
            try {
                String value = (String) field.get(object);
                LOG.info(String.format("Field: %s, value: %s", field.getName(), value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}