package com.epam.lab.task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Person {
    private final static Logger LOG = LogManager.getLogger(Person.class);

    void uselessMethod() {
        LOG.info("uselessMethod: Void method without parameters");
    }

    String getFullName(String firstName, String lastName) {
        String fullName = String.format("%s %s", firstName, lastName);
        LOG.info(String.format("getFullNam: %s and %s - String input parameter, return type - String(%s)",
                firstName, lastName, fullName));
        return fullName;
    }

    int findOlderPerson(int firstPersonAge, int secondPersonAge) {
        int result = Math.max(firstPersonAge, secondPersonAge);
        LOG.info(String.format("findOlderPerson: %d and %d - int input parameter, return type - int(%d)",
                firstPersonAge, secondPersonAge, result));
        return result;
    }
}