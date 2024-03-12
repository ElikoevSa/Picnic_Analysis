package ru.elikoev.piknik.data;

import ru.elikoev.piknik.data.service.WordFrequencyAnalyzerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyAnalyzer implements WordFrequencyAnalyzerService {
    public WordFrequencyAnalyzer() {
    }

    @Override
    public Map<String, Integer> calculateWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        if (text == null || text.isEmpty()) {
            return wordFrequency;
        }
        String[] words = text.split("\\s+");
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        return wordFrequency;
    }

    @Override
    public List<String> sortWordsByFrequency(Map<String, Integer> wordFrequency) {
        List<String> sortedWords = new ArrayList<>(wordFrequency.keySet());
        sortedWords.sort((word1, word2) -> wordFrequency.get(word2).compareTo(wordFrequency.get(word1)));
        return sortedWords;
    }


}