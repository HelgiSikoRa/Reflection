package com.epam.lab.task6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    void callMethodAtRuntimeUsingReflection(Object object, int[] intArgs, String[] stringArgs) {
        Class classInstance = object.getClass();
        try {
            Method method = classInstance.getMethod("myMethod", String.class, int[].class);
            Method method1 = classInstance.getMethod("myMethod", String[].class);

            method.invoke(object, "Total", intArgs);
            method1.invoke(object, new Object[]{stringArgs});
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}