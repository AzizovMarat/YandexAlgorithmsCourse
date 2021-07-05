package Keyboard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Keyboard {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        List<Integer> dictionary = Arrays.stream(strings.get(1).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> events = Arrays.stream(strings.get(3).split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0, index; i < events.size(); i++) {
            index = events.get(i) - 1;
            dictionary.set(index, dictionary.get(index) - 1);
        }
        for (Integer i : dictionary) {
            System.out.println((i < 0) ? "YES" : "NO");
        }
    }
}