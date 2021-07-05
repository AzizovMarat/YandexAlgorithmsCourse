package NumberOfTheAppearanceOfTheWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NumberOfTheAppearanceOfTheWord {
    public static void main(String[] args) throws IOException {
        StringBuilder string = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                string.append(reader.readLine()).append(" ");
            }
        }

        String[] resultString = string.toString().split("\\s+");
        Map<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < resultString.length; i++) {
            if (dictionary.containsKey(resultString[i])) {
                dictionary.put(resultString[i], dictionary.get(resultString[i]) + 1);
                System.out.print(dictionary.get(resultString[i]) + " ");
            } else {
                dictionary.put(resultString[i], 0);
                System.out.print(0 + " ");
            }
        }
    }
}