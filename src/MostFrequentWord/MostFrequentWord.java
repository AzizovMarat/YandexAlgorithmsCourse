package MostFrequentWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) throws IOException {
        StringBuilder string = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                string.append(reader.readLine()).append(" ");
            }
        }

        String[] resultString = string.toString().split("\\s+");
        Map<String, Integer> dictionary = new TreeMap<>();
        int best = 0;
        int current = 0;
        for (int i = 0; i < resultString.length; i++) {
            if (dictionary.containsKey(resultString[i])) {
                current = dictionary.get(resultString[i]) + 1;
                dictionary.put(resultString[i], current);
                if (current > best) best = current;
            } else {
                dictionary.put(resultString[i], 0);
            }
        }
        for (Map.Entry<String, Integer> e : dictionary.entrySet()) {
            if (e.getValue() == best) {
                System.out.println(e.getKey());
                return;
            }
        }
    }
}