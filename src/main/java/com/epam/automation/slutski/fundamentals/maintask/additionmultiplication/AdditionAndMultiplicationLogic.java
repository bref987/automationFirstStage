package com.epam.automation.slutski.fundamentals.maintask.additionmultiplication;

public class AdditionAndMultiplicationLogic {

    public static int addArguments(String[] array) {
        int sum = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(array[i]);
        }
        return sum;
    }

    public static int multiplyArguments(String[] array) {
        int mult = 1;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            mult *= Integer.parseInt(array[i]);
        }
        return mult;
    }
}
