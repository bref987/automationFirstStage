package com.epam.automation.slutski.collections.maintask;

import com.epam.automation.slutski.collections.maintask.styles.ReggaeStyles;
import com.epam.automation.slutski.collections.maintask.styles.RockStyles;
import com.epam.automation.slutski.collections.maintask.tracks.Reggae;
import com.epam.automation.slutski.collections.maintask.tracks.Rock;
import com.epam.automation.slutski.collections.maintask.tracks.RussianRock;
import com.epam.automation.slutski.collections.maintask.tracks.Track;
import com.epam.automation.slutski.collections.maintask.view.Printer;

import java.util.Arrays;
import java.util.List;

public class TrackController {
    public static void main(String[] args) {

        List<? extends Track> sound = Arrays.asList(
                new Rock("Animal Boy", "Ramones", 3.25, RockStyles.PUNK),
                new Rock("Meat Is Murder", "Smiths", 6.25, RockStyles.INDIE),
                new Reggae("Take Five", "King Tubby", 6.15, ReggaeStyles.DUB),
                new Reggae("Moon Hop", "Derrick Morgan", 4.25, ReggaeStyles.EARLY),
                new Rock("Nevermind", "Nirvana", 3.1, RockStyles.ALTERNATIVE),
                new Rock("Station To Station", "David Bowie", 2.25, RockStyles.EXPERIMENTAL),
                new RussianRock("Blood Group", "Kino", 5.2, RockStyles.RUSSIAN),
                new Rock("Sabotage", "Black Sabbath", 4.3, RockStyles.HEAVY),
                new Reggae("Amigo", "Black Slate", 6.45, ReggaeStyles.ROOTS),
                new Reggae("Florida", "Diplo", 4.25, ReggaeStyles.DANCEHALL)
        );

        SoundRecord record = new SoundRecord(sound);

        Printer.print(record.getTotalDuration());
        System.out.println();

        Printer.print(record.applyRockReggaeOrder());
        System.out.println();

        Printer.print(record.applyReggaeRockOrder());
        System.out.println();

        Printer.print(record.getDurationLimit(3, 5));
        System.out.println();

        Printer.print(record.getDurationLimit(4));
        System.out.println();
    }
}
