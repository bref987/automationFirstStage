package com.epam.automation.slutski.fundamentals.optionaltask.average;

public class AverageDigitLengthController {

    public static void main(String[] args) {

        int[] testArray = new int[] {1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789};

        AverageDigitLengthView.printDigitsWithLessThanAverageLength(testArray);
        System.out.println();
        AverageDigitLengthView.printDigitsWithMoreThanAverageLength(testArray);

    }
}
