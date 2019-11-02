package com.epam.automation.slutski.fundamentals.maintask.reversedarguments;

public class ReversedArgumentsController {

    public static void main(String[] args) {
        String[] reversedArgs = ReversedArgumentsLogic.reverseArray(args);

        ReversedArgumentsView.printArrayToConsole(reversedArgs);
    }
}
