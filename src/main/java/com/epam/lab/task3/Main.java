package com.epam.lab.task3;

public class Main {
    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        Person person = new Person();

        person.setFirstName("Sarah");
        person.setLastName("Konnor");

        reflection.printAnnotationValue(person);
    }
}