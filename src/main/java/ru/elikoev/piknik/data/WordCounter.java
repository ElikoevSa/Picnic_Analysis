package ru.elikoev.piknik.data;

import ru.elikoev.piknik.data.service.WordCounterService;

public class WordCounter implements WordCounterService {

    public WordCounter() {
    }

    @Override
    public int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
}