package com.epam.automation.slutski.collections.maintask;

import com.epam.automation.slutski.collections.maintask.tracks.Reggae;
import com.epam.automation.slutski.collections.maintask.tracks.Rock;
import com.epam.automation.slutski.collections.maintask.tracks.Track;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SoundRecord {

    private List<? extends Track> tracks;

    public SoundRecord(List<? extends Track> tracks) {
        this.tracks = tracks;
    }

    public List<? extends Track> getTracks() {
        return tracks;
    }

    public List<Double> getAllDurations() {
        List<Double> allDurations = new ArrayList<>();
        for (Track elem : tracks) {
            allDurations.add(elem.getDuration());
        }
        return allDurations;
    }

    public double getTotalDuration() {
        List<Double> allDurations = getAllDurations();
        Stream<Double> stream = allDurations.stream();
        return stream.reduce((double) 0, (a, b) -> a + b);
    }

    public List<? extends Track> getDurationLimit(double end) {
        Stream<? extends Track> stream = tracks.stream();
        return stream
                .filter(a -> a.getDuration() <= end)
                .collect(Collectors.toList());
    }

    public List<? extends Track> getDurationLimit(double start, double end) {
        Stream<? extends Track> stream = tracks.stream();
        return stream
                .filter(a -> a.getDuration() >= start && a.getDuration() <= end)
                .collect(Collectors.toList());
    }

    public List<? extends Track> getRocks() {
        Stream<? extends Track> stream = tracks.stream();
        return stream
                .filter(a -> a instanceof Rock)
                .collect(Collectors.toList());
    }

    public List<? extends Track> getReggaes() {
        Stream<? extends Track> stream = tracks.stream();
        return stream
                .filter(a -> a instanceof Reggae)
                .collect(Collectors.toList());
    }

    public List<Rock> sortByRockStyles() {
        List<? extends Track> rockOrder = getRocks();
        Stream<Rock> stream = rockOrder.stream().map(a -> (Rock) a);
        return stream
                .sorted(Comparator.comparing(Rock::getStyle))
                .collect(Collectors.toList());
    }

    public List<Reggae> sortByReggaeStyles() {
        List<? extends Track> reggaeOrder = getReggaes();
        Stream<Reggae> stream = reggaeOrder.stream().map(a -> (Reggae) a);
        return stream
                .sorted(Comparator.comparing(Reggae::getStyle))
                .collect(Collectors.toList());
    }

    public List<Track> applyRockReggaeOrder() {
        List<Track> order = new ArrayList<>();
        order.addAll(sortByRockStyles());
        order.addAll(sortByReggaeStyles());
        return order;
    }

    public List<? extends Track> applyReggaeRockOrder() {
        List<Track> order = new ArrayList<>();
        order.addAll(sortByReggaeStyles());
        order.addAll(sortByRockStyles());
        return order;
    }

    @Override
    public String toString() {
        return "Record{" +
                "tracks=" + tracks +
                "}";
    }
}
