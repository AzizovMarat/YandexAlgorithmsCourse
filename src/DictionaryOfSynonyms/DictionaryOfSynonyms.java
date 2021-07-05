package DictionaryOfSynonyms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DictionaryOfSynonyms {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        Map<String, String> dictionary = new HashMap<>();
        for (int i = 1; i < strings.size() - 1; i++) {
            String[] temp = strings.get(i).split(" ");
            dictionary.put(temp[0], temp[1]);
        }
        String word = strings.get(strings.size() - 1);

        for (Map.Entry e : dictionary.entrySet()) {
            if (e.getValue().equals(word)) System.out.println(e.getKey());
            if (e.getKey().equals(word)) System.out.println(e.getValue());
        }
    }
}