package com.epam.automation.slutski.collections.maintask.tracks;

import com.epam.automation.slutski.collections.maintask.styles.ReggaeStyles;

public class Reggae extends Track {

    private ReggaeStyles style;

    public Reggae(String title, String singer, double duration, ReggaeStyles style) {
        super(title, singer, duration);
        this.style = style;
    }

    public void play() {
        System.out.printf("Play %s track %n", style);
    }

    public void stop() {
        System.out.printf("Stop %s track %n", style);
    }

    public ReggaeStyles getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", style=" + style +
                        "}");
    }
}
