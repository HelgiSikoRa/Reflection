package com.epam.lab.task7;

public class Main {
    public static void main(String[] args) {
        Object ownClass = new OwnClass("Sarah", "Connor");
        Reflection reflection = new Reflection();

        try {
            reflection.showClassName(ownClass);

            reflection.showSuperClass();

            reflection.showPackage();

            reflection.showInterface();

            reflection.showConstructor();

            reflection.showField(ownClass);

            reflection.showMethod(ownClass);

        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}