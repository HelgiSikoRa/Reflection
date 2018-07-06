package com.epam.lab.task2;

public class Person {
    @CustomAnnotation
    private String firstName;
    @CustomAnnotation
    private String secondName;
    String adress;

    Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}