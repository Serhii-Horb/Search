package de.telran.Ex4_02_09.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TextSplitter {
    public List<Word> splitText(String text) {
        List<Word> result = new ArrayList<>();
        String[] words = text.split(" ");
        for (String word : words) {
            result.add(new Word(word.toLowerCase(Locale.ROOT))); // Locale.ROOT передаёт язык который стоит на компе
        }
        return result;
    }
}
