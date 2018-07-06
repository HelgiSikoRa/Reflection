package com.epam.lab.task6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Person {
    private final static Logger LOG = LogManager.getLogger(Person.class);

    public void myMethod(String stringVar, int... args) {
        int total = 0;
        for (int arg : args) {
            total += arg;
        }
        LOG.info(String.format("%s: %d.", stringVar, total));
    }

    public void myMethod(String... args) {
        StringBuilder result = new StringBuilder();
        for (String arg : args) {
            result.append(arg).append(" ");
        }
        LOG.info(String.format("%s ", result.toString()));
    }
}