package com.epam.lab.task5;

public class Main {
    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        Person person = new Person();

        reflection.setValueToUnknownType(person);
    }
}