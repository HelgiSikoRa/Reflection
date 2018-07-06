package com.epam.lab.task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        //no parameter
        Class[] noParam = {};

        //String parameters
        Class[] stringParam = new Class[2];
        stringParam[0] = String.class;
        stringParam[1] = String.class;

        //int parameters
        Class[] intParam = new Class[2];
        intParam[0] = Integer.TYPE;
        intParam[1] = Integer.TYPE;

        Class<Person> classInstance = Person.class;
        try {
            Object object = classInstance.newInstance();

            //invoke method without parameters
            Method method = classInstance.getDeclaredMethod("uselessMethod", noParam);
            method.invoke(object, null);

            //invoke method with String parameters
            method = classInstance.getDeclaredMethod("getFullName", stringParam[0], stringParam[1]);
            method.invoke(object, "Sarah", "Connor");

            //invoke method with int parameter
            method = classInstance.getDeclaredMethod("findOlderPerson", intParam[0], intParam[1]);
            method.invoke(object, 25, 48);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}