package ru.elikoev.piknik.data.service;

import java.util.List;
import java.util.Map;

public interface WordFrequencyAnalyzerService {
    Map<String, Integer> calculateWordFrequency(String text);
    List<String> sortWordsByFrequency(Map<String, Integer> wordFrequency);
}