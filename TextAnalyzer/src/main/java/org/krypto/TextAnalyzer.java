package org.krypto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TextAnalyzer {
    private final String text;

    public TextAnalyzer(Path filePath) throws IOException {
        this.text = Files.readString(filePath);
    }

    public TextAnalyzer(String text) {
        this.text = text;
    }


    public int countWords() {
        int words = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }
        return words+1;
    }

    public int countSentences() {
        int sents = 0;
        for(int i =0; i < text.length();i++) {
            if (text.charAt(i) == '.'|| text.charAt(i) =='!'|| text.charAt(i) =='?') {
                sents++;
            }
        }
        return sents;
    }

    public Map<String,Integer> topWords(String text, int topN) {
        Map<String,Integer> wordCount = new HashMap<>();

        //dzielimy tekst na slowa
        String[] words = text.toLowerCase().split("\\W+");

        //liczymy wystapienie slow
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
        }

        return wordCount.entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(topN)
                .collect(
                        LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll
                );
    }

    public String statistics(){
        return
                "--------------Statystyki-------------\n" +
                "Liczba slow: "+countWords()+"!\n" +
                "Liczba zdan: "+countSentences()+"!\n" +
                "Top 5 slow: "+topWords(text,5) + " !\n" +
                " ------------------------------------";
    }

}
