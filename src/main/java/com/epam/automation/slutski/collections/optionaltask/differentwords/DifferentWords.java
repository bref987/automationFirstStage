package com.epam.automation.slutski.collections.optionaltask.differentwords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferentWords {

    public static Set<String> findDifferentWords() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("./src/resources/textInEnglish.txt"));

        Set<String> words = new HashSet<>();

        while (scanner.hasNext()) {
            words.addAll(Stream.of(scanner.next()
                    .replaceAll("\\p{Punct}", " ")
                    .toLowerCase()
                    .split("\\s+"))
                    .collect(Collectors.toSet()));
        }

        return words;
    }
}
