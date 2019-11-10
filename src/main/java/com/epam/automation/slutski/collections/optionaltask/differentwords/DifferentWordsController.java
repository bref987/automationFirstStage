package com.epam.automation.slutski.collections.optionaltask.differentwords;

import java.io.FileNotFoundException;

import static com.epam.automation.slutski.collections.optionaltask.differentwords.DifferentWords.findDifferentWords;
import static com.epam.automation.slutski.collections.optionaltask.differentwords.DifferentWordsView.print;

public class DifferentWordsController {
    public static void main(String[] args) throws FileNotFoundException {

        print(findDifferentWords());
    }
}
