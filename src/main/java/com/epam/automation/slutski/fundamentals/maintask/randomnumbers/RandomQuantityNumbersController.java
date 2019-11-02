package com.epam.automation.slutski.fundamentals.maintask.randomnumbers;

public class RandomQuantityNumbersController {
    public static void main(String[] args) {
        int[] randomNumbersArray = RandomQuantityNumbersLogic.fillArrayByRandomNumbers();

        RandomQuantityNumberView.printNumbersByLines(randomNumbersArray);
    }
}
