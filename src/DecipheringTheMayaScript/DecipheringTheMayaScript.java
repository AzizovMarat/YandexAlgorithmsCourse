package DecipheringTheMayaScript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DecipheringTheMayaScript {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
        }

        String w = strings.get(1);
        String s = strings.get(2);

        int[] dictionary = new int[123];
        int countWSymbols = fillDictionary(dictionary, w, w.length());

        char index;
        int countSymbols = 0;

        int[] current = new int[123];
        for (int i = 0; i < w.length(); i++) {
            index = s.charAt(i);
            current[index] = current[index] + 1;
            if (current[index] == dictionary[index]) countSymbols++;
        }

        int countWords = (countSymbols == countWSymbols) ? 1 : 0;

        for (int i = w.length(); i < s.length(); i++) {
            index = s.charAt(i);
            char c = s.charAt(i - w.length());
            if (current[c]-- == dictionary[c]) countSymbols--;
            if (++current[index] == dictionary[index]) countSymbols++;
            if (countSymbols == countWSymbols) countWords++;
        }

        System.out.println(countWords);
    }

    public static int fillDictionary(int[] dictionary, String w, int substring) {
        int countWSymbols = 0;
        char index;
        for (int i = 0; i < substring; i++) {
            index = w.charAt(i);
            if (dictionary[index] == 0) countWSymbols++;
            dictionary[index] = dictionary[index] + 1;
        }
        return countWSymbols;
    }
}