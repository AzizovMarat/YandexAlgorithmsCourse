package OpenCalculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class OpenCalculator {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        Set<String> setStr1 = new HashSet<>(Arrays.asList(strings.get(0).split(" ")));
        Set<Integer> set1 = setStr1.stream().map(Integer::parseInt).collect(Collectors.toSet());
        Set<Integer> set2 = strings.get(1).chars().mapToObj(ch -> ch - '0').collect(Collectors.toSet());

        set2.removeAll(set1);

        System.out.println(set2.size());

    }
}