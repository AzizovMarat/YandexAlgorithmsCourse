package AlienGenome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AlienGenome {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        Set<String> genome2 = new HashSet<>();

        for (int i = 1; i < strings.get(1).length(); i++) {
            genome2.add(strings.get(1).charAt(i - 1) + String.valueOf(strings.get(1).charAt(i)));
        }
        int count = 0;
        for (int i = 1; i < strings.get(0).length(); i++) {
            if (genome2.contains(strings.get(0).charAt(i - 1) + String.valueOf(strings.get(0).charAt(i)))) count++;
        }
        System.out.println(count);
    }
}