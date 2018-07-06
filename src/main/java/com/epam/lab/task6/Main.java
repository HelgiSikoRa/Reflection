package com.epam.lab.task6;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Reflection reflection = new Reflection();

        int[] intArguments = {15, 18, 40, 34, 29};
        String[] stringArguments = {"Sarah", "Connor", "Cipriani's 42nd Street", "New York City."};

        reflection.printAnnotationValue(person, intArguments, stringArguments);
    }
}