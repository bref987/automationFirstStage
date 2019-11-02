package com.epam.automation.slutski.fundamentals.maintask.reversedarguments;

public class ReversedArgumentsLogic {

    public static String[] reverseArray(String[] arrayToReverse) {
        String temp;
        int length = arrayToReverse.length;
        int middleLength = length / 2;

        for (int i = 0; i < middleLength; i++) {
            temp = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[length - 1 - i];
            arrayToReverse[length - 1 - i] = temp;
        }
        return arrayToReverse;
    }
}
