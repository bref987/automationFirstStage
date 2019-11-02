package com.epam.automation.slutski.fundamentals.maintask.randomnumbers;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomQuantityNumbersLogic {
    public static int[] fillArrayByRandomNumbers() {
        int quantityOfNumbers = 0;
        Random random = new Random();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a quantity of numbers: ");

        try {
            quantityOfNumbers = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter in Integer number");
        }

        // fill the array with random numbers
        int[] randomNumbersArray = new int[quantityOfNumbers];
        for (int i = 0; i < quantityOfNumbers; i++) {
            randomNumbersArray[i] = random.nextInt(100);
        }
        return randomNumbersArray;
    }
}
