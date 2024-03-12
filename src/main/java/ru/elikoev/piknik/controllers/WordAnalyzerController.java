package ru.elikoev.piknik.controllers;

import org.springframework.web.bind.annotation.*;
import ru.elikoev.piknik.App;

@RestController
@RequestMapping("/word-analyzer")
public class WordAnalyzerController {

    private final App mainApp;

    public WordAnalyzerController(App mainApp) {
        this.mainApp = mainApp;
    }

    @PostMapping("/analyze/")
    public String analyzeText(@RequestBody String text) {
        return mainApp.analyzeText(text);
    }
}
