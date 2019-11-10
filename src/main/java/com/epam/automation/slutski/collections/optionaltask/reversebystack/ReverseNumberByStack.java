package com.epam.automation.slutski.collections.optionaltask.reversebystack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumberByStack {

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String reverseString() {

        String string = "";
        String reversedString = "";
        Deque<String> stack = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");

        string = scan.next();

        String[] inputString = string.split("");

        for (String num : inputString) {
            stack.push(num);
        }

        while (!(stack.isEmpty())) {
            reversedString += stack.pop();
        }
        return reversedString;
    }

    public static int reverseNumber() {

        String reversedNumber = reverseString();
        return isNumber(reversedNumber) ? Integer.parseInt(reversedNumber) : reverseNumber();
    }
}
