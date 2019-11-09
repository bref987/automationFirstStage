package com.epam.automation.slutski.collections.maintask.tracks;

import com.epam.automation.slutski.collections.maintask.styles.RockStyles;

public class RussianRock extends Rock {

    public RussianRock(String title, String singer, double duration, RockStyles style) {
        super(title, singer, duration, style);
    }

    public void play() {
        System.out.printf("Vkluchay %s track %n", getStyle());
    }

    public void stop() {
        System.out.printf("Vykluchay %s track %n", getStyle());
    }
}
