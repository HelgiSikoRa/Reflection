package com.epam.lab.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

class Reflection {
    private final static Logger LOG = LogManager.getLogger(Reflection.class);

    void setValueToUnknownType(Object object) {
        Class classInstance = object.getClass();
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String fieldType = field.getType().toString();
            try {
                switch (fieldType) {
                    case "class java.lang.String":
                        field.set(object, "Sara");
                        LOG.info("Type 'String' new value: " + field.get(object).toString());
                        break;
                    case "int":
                        field.set(object, 100000);
                        LOG.info("Type 'int' new value: " + field.getInt(object));
                        break;
                    case "boolean":
                        field.set(object, true);
                        LOG.info("Type 'boolean' new value: " + field.getBoolean(object));
                        break;
                    case "char":
                        field.set(object, 'C');
                        LOG.info("Type 'char' new value: " + field.getChar(object));
                        break;
                    case "byte":
                        field.set(object, (byte) 100);
                        LOG.info("Type 'byte' new value: " + field.getByte(object));
                        break;
                    case "short":
                        field.set(object,(short) 100);
                        LOG.info("Type 'short' new value: " + field.getShort(object));
                        break;
                    case "double":
                        field.set(object, 123.4);
                        LOG.info("Type 'double' new value: " + field.getDouble(object));
                        break;
                    case "float":
                        field.set(object, 2.5f);
                        LOG.info("Type 'float' new value: " + field.getFloat(object));
                        break;
                    case "long":
                        field.set(object, 100000L);
                        LOG.info("Type 'long' new value: " + field.getLong(object));
                        break;
                }
                field.setAccessible(false);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}