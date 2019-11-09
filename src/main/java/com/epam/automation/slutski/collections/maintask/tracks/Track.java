package com.epam.automation.slutski.collections.maintask.tracks;

public class Track {

    private String title;
    private String singer;
    private double duration;

    public Track(String title, String singer, double duration) {
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Play track");
    }

    public void stop() {
        System.out.println("Stop track");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", duration=" + duration +
                "}";
    }
}
