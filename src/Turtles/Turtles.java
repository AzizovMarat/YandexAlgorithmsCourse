package Turtles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Turtles {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        int quantity = Integer.parseInt(strings.get(0));
        if (quantity < 1 || quantity > 10000) return;
        int a, b;
        String[] temp;
        Set<String> set = new HashSet<>();
        for (int i = 1; i < quantity + 1; i++) {
            temp = strings.get(i).split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            if (a >= 0 && b >= 0 && a < quantity && b < quantity)
                if (a + b == quantity - 1) set.add((a) + " " + (b));
        }
        System.out.println(set.size());
    }
}