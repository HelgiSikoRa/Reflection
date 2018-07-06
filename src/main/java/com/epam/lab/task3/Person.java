package com.epam.lab.task3;

public class Person {
    @CustomAnnotation(id = 1235)
    private String firstName;
    @CustomAnnotation(id = 1236)
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }
}