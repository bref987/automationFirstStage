package com.epam.automation.slutski.fundamentals.maintask.hellouser;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you name: ");

        String userName = scan.next();

        System.out.print("Hello, " + userName);
    }
}
