package com.epam.lab.task7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    private final static Logger LOG = LogManager.getLogger(Reflection.class);

    private Class getClassInstance() throws ClassNotFoundException {
        Class classInstance = Class.forName("com.epam.lab.task7.OwnClass");
        return classInstance;
    }

    void showClassName(Object object) throws ClassNotFoundException {
        Class classInstance = getClassInstance();
        String className = classInstance.getSimpleName();
        LOG.info(String.format("Class name: %s", className));
    }

    void showSuperClass() throws ClassNotFoundException {
        Class classInstance = getClassInstance();
        Class superclass = classInstance.getSuperclass();
        LOG.info(String.format("\nClass Parent: %s", superclass.getSimpleName()));
    }

    void showPackage() throws ClassNotFoundException {
        Class classInstance = getClassInstance();
        Package classPackage = classInstance.getPackage();
        LOG.info(String.format("\nClass package: %s\n", classPackage));
    }

    void showInterface() throws ClassNotFoundException {
        Class classInstance = getClassInstance();
        Class[] classInterface = classInstance.getInterfaces();
        for (Class clazz : classInterface) {
            LOG.info(String.format("Class interface: %s", clazz.getSimpleName()));
        }
    }

    void showConstructor() throws ClassNotFoundException {
        Class classInstance = getClassInstance();
        Constructor[] constructor = classInstance.getDeclaredConstructors();
        for (Constructor constr : constructor) {
            LOG.info(String.format("Class constructor: %s", constr));
        }
    }

    void showField(Object object) throws ClassNotFoundException, IllegalAccessException {
        Class classInstance = getClassInstance();
        Field[] fields = classInstance.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            LOG.info(String.format("Class field: %s %s %s", field.getType(), field.getName(), field.get(object).toString()));
            field.setAccessible(false);
        }
    }

    void showMethod(Object object) throws ClassNotFoundException {
        Class classInstance = getClassInstance();
        Method[] methods = classInstance.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            LOG.info(String.format("Class method: %s %s ", method.getReturnType(), method.getName()));
            method.setAccessible(false);
        }
    }
}