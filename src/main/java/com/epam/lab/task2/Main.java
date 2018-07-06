package com.epam.lab.task2;

public class Main {

    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        Person person = new Person("Sarah", "Konnor");
        reflection.printAnnotatedFields(person);
    }
}