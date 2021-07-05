package Polyglots;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Polyglots {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        int quantity = Integer.parseInt(strings.get(0));

        Set<String>[] students = new HashSet[quantity];
        for (int i = 0; i < quantity; i++) {
            students[i] = new HashSet<>();
        }

        for (int i = 1; i < strings.size(); i++) {
            int count = Integer.parseInt(strings.get(i));
            --quantity;
            for (int j = 0; j < count; j++) {
                students[quantity].add(strings.get(++i));
            }
        }
        Set<String> res = new HashSet<>();
        for (Set<String> student : students) {
            res.addAll(student);
        }

        Set<String> retainAll = new HashSet<>(res);
        for (Set<String> student : students) {
            retainAll.retainAll(student);
        }

        System.out.println(retainAll.size());
        retainAll.forEach(System.out::println);

        System.out.println(res.size());
        res.forEach(System.out::println);
    }
}