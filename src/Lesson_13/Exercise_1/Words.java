package Lesson_13.Exercise_1;

import java.util.*;

public class Words {
    public static Set<String> addElementsToSet(String[] array) {
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String arrayElem : array) {
            uniqueWords.add(arrayElem.toLowerCase());
        }
        return uniqueWords;
    }

    public static void printListOfUniqueWords(String[] array) {
        System.out.println("Уникальные слова: " + addElementsToSet(array));
    }

    public static void printNumberOfUniqueWord(String[] array) {
        List<String> allWords = new ArrayList<>();
        for (String arrayElem : array) {
            allWords.add(arrayElem.toLowerCase());
        }
        for (String wordElem : addElementsToSet(array)) {
            System.out.println("Слово \"" + wordElem + "\" встречается: " +
                    Collections.frequency(allWords, wordElem) + " р.");
        }
    }
}
