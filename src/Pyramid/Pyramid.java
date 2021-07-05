package Pyramid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Pyramid {
    public static void main(String[] args) throws IOException {
        List<String> strings;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            strings = new ArrayList<>(Integer.parseInt(reader.readLine()));
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        Map<Integer, Integer> dictionary = new TreeMap<>(Collections.reverseOrder());
        String[] temp;
        for (int i = 0, w, h; i < strings.size(); i++) {
            temp = strings.get(i).split(" ");
            w = Integer.parseInt(temp[0]);
            h = Integer.parseInt(temp[1]);
            if (dictionary.containsKey(w)) {
                dictionary.put(w, (h > dictionary.get(w)) ? h : dictionary.get(w));
            } else {
                dictionary.put(w, h);
            }
        }
        long height = 0;
        for (Map.Entry<Integer, Integer> e : dictionary.entrySet()) {
            height += e.getValue();
        }
        System.out.println(height);
    }
}