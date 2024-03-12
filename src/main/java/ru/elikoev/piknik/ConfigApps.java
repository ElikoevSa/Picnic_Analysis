package ru.elikoev.piknik;

import jakarta.servlet.MultipartConfigElement;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import ru.elikoev.piknik.data.*;
import ru.elikoev.piknik.data.service.FileService;
import ru.elikoev.piknik.data.service.LongestWordService;
import ru.elikoev.piknik.data.service.WordCounterService;
import ru.elikoev.piknik.data.service.WordFrequencyAnalyzerService;

@Configuration
public class ConfigApps {
    @Bean
    public WordCounterService wordCounterService() {
        return new WordCounter();
    }

    @Bean public LongestWordService longestWordService() {
        return new LongestWordFinder();
    }

    @Bean public WordFrequencyAnalyzerService wordFrequencyAnalyzerService(){
        return new WordFrequencyAnalyzer();
    }
//    @Bean public FileHandler fileHandler(){
//        return new FileHandler();
//    }

    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofMegabytes(1));
        factory.setMaxRequestSize(DataSize.ofMegabytes(1));
        return factory.createMultipartConfig();
    }

}
