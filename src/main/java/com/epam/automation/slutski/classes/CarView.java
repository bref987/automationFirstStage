package com.epam.automation.slutski.classes;

public class CarView {

    public static void printCars(Car[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
