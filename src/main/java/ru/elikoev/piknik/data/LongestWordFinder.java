package ru.elikoev.piknik.data;

import ru.elikoev.piknik.data.service.LongestWordService;

public class LongestWordFinder implements LongestWordService {

    @Override
    public String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word+"\n";
            }
        }
        return longestWord;
    }

    @Override
    public String toString() {
        return "LongestWordFinder{}";
    }
}