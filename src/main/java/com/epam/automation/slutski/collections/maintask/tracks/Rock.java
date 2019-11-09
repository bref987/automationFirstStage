package com.epam.automation.slutski.collections.maintask.tracks;

import com.epam.automation.slutski.collections.maintask.styles.RockStyles;

public class Rock extends Track {
    private RockStyles style;

    public Rock(String title, String singer, double duration, RockStyles style) {
        super(title, singer, duration);
        this.style = style;
    }

    public void play() {
        System.out.printf("Play %s track %n", style);
    }

    public void stop() {
        System.out.printf("Stop %s track %n", style);
    }

    public RockStyles getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", style=" + style +
                        "}");
    }
}
