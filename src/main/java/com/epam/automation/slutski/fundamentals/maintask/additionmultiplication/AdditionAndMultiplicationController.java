package com.epam.automation.slutski.fundamentals.maintask.additionmultiplication;

public class AdditionAndMultiplicationController {

    public static void main(String[] args) {
        int sumOfArguments = AdditionAndMultiplicationLogic.addArguments(args);
        int multOfArguments = AdditionAndMultiplicationLogic.multiplyArguments(args);

        System.out.println("sum of arguments " + sumOfArguments);
        System.out.println("multiplication result of arguments " + multOfArguments);
    }
}
