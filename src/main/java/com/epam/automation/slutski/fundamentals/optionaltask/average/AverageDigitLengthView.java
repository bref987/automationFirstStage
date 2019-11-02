package com.epam.automation.slutski.fundamentals.optionaltask.average;

import static com.epam.automation.slutski.fundamentals.optionaltask.average.AverageDigitLengthLogic.findAverageDigitsLength;

public class AverageDigitLengthView {

    public static void printDigitsWithLessThanAverageLength(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (Integer.toString(array[i]).split("").length <  findAverageDigitsLength(array)) {
                System.out.print("has less than average length: " + array[i] +
                        " length: " + Integer.toString(array[i]).split("").length + "\n");
            }
        }
    }

    public static void printDigitsWithMoreThanAverageLength(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (Integer.toString(array[i]).split("").length > findAverageDigitsLength(array)) {
                System.out.print("has more than average length: " + array[i] +
                        " length: " + Integer.toString(array[i]).split("").length + "\n");
            }
        }
    }
}
