package com.epam.automation.slutski.fundamentals.optionaltask.average;

public class AverageDigitLengthLogic {

    public static int findAverageDigitsLength(int[] ar) {
        int length = ar.length;
        int sumOfLengths = 0;

        for (int i = 0; i < length; i++) {
            sumOfLengths += Integer.toString(ar[i]).split("").length;
        }
        return sumOfLengths / length;
    }
}
