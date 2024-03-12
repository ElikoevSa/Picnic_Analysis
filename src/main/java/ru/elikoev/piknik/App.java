package ru.elikoev.piknik;

import org.springframework.stereotype.Component;
import ru.elikoev.piknik.data.service.LongestWordService;
import ru.elikoev.piknik.data.service.WordCounterService;
import ru.elikoev.piknik.data.service.WordFrequencyAnalyzerService;

import java.util.List;
import java.util.Map;

@Component
public class App {
    private final WordCounterService wordCounterService;
    private final LongestWordService longestWordService;
    private final WordFrequencyAnalyzerService wordFrequencyAnalyzerService;

    public App(WordCounterService wordCounterService, LongestWordService longestWordService, WordFrequencyAnalyzerService wordFrequencyAnalyzerService) {
        this.wordCounterService = wordCounterService;
        this.longestWordService = longestWordService;
        this.wordFrequencyAnalyzerService = wordFrequencyAnalyzerService;
    }

    public String analyzeText(String text) {
        int wordCount = wordCounterService.countWords(text);
        String longestWord = longestWordService.findLongestWord(text);
        Map<String, Integer> wordFrequency = wordFrequencyAnalyzerService.calculateWordFrequency(text);
        List<String> sortedWordsByFrequency = wordFrequencyAnalyzerService.sortWordsByFrequency(wordFrequency);

        return "Word count: " + wordCount + "\n" +
                "\nLongest word: " + longestWord + "\n" +
                "Word frequency: " + wordFrequency.toString() + "\n" +
                "Sorted words by frequency: " + sortedWordsByFrequency.toString();
    }
}
