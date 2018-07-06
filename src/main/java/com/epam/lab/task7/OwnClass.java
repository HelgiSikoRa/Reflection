package com.epam.lab.task7;

import java.io.Serializable;

public class OwnClass implements Serializable {
    private String firstName;
    private String secondName;
    private int age;

    OwnClass() {
    }

    public OwnClass(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public OwnClass(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFullName(String firstName, String secondName) {
        String fullName = String.format("%s %s", firstName, secondName);
        return fullName;
    }

    @Deprecated
    public static void printSomeInformation() {
        System.out.println("Method printing some information.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("secondName: + %s", secondName);
    }
}