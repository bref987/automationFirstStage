package com.epam.automation.slutski.fundamentals.maintask.month;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        int month;
        int beforeFirstMonth = 0;
        int afterLastMonth = 13;
        Map<Integer, String> monthsMap = new HashMap<Integer, String>();
        monthsMap.put(1, "January");
        monthsMap.put(2, "February");
        monthsMap.put(3, "Mars");
        monthsMap.put(4, "April");
        monthsMap.put(5, "May");
        monthsMap.put(6, "June");
        monthsMap.put(7, "July");
        monthsMap.put(8, "August");
        monthsMap.put(9, "September");
        monthsMap.put(10, "October");
        monthsMap.put(11, "November");
        monthsMap.put(12, "December");
        monthsMap.put(-1, "There are only twelve months in the year");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of month: ");

        if (scan.hasNextInt()) {
            month = scan.nextInt();
            month = month > beforeFirstMonth && month < afterLastMonth ? month : -1;
            System.out.println(monthsMap.get(month));
        } else {
            System.out.print("Enter a number of month between 1 and 12");
        }
    }
}
