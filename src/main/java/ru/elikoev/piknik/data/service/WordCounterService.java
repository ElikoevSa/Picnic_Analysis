package ru.elikoev.piknik.data.service;

import org.springframework.stereotype.Component;


public interface WordCounterService {
    int countWords(String text);
}