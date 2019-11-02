package com.epam.automation.slutski.fundamentals.maintask.randomnumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomQuantityNumberView {

    public static void printNumbersByLines(int[] array) {
        int quantityOfNumbersByLine = 0;
        int length = array.length;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a quantity of numbers in line: ");

        try {
            quantityOfNumbersByLine = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter in Integer number");
        }

        // print numbers arranged by lines according set quantity of numbers by line
        try {
            for (int i = 1; i < length + 1; i++) {
                if (i % quantityOfNumbersByLine != 0) {
                    System.out.print(array[i - 1] + " ");
                } else {
                    System.out.print(array[i - 1] + "\n");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Number must be > 0");
        }
    }
}
