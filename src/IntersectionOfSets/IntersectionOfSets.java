package IntersectionOfSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IntersectionOfSets {
    public static void main(String[] args) throws IOException {
        List<Integer> ints = new ArrayList<>();
        List<Integer> ints2 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            for (String s : temp) {
                ints.add(Integer.parseInt(s));
            }
            String[] temp2 = reader.readLine().split(" ");
            for (String s : temp2) {
                ints2.add(Integer.parseInt(s));
            }
        }

        Set<Integer> treeSet = new TreeSet<>(ints);
        treeSet.retainAll(new TreeSet<>(ints2));
        for (int i : treeSet) {
            System.out.print(i + " ");
        }

    }
}