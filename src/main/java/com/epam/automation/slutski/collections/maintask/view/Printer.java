package com.epam.automation.slutski.collections.maintask.view;

import com.epam.automation.slutski.collections.maintask.tracks.Track;

import java.util.List;

public class Printer {
    public static void print(List<? extends Track> list) {
        list.stream().forEach(System.out::println);
    }

    public static void print(double d) {
        System.out.println(d);
    }
}
