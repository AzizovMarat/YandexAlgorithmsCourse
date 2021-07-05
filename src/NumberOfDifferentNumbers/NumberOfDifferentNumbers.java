package NumberOfDifferentNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfDifferentNumbers {
    public static void main(String[] args) throws IOException {
        List<Integer> ints = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            for (String s : temp) {
                ints.add(Integer.parseInt(s));
            }
        }

        Set<Integer> set = new HashSet<>(ints);
        System.out.println(set.size());
    }
}