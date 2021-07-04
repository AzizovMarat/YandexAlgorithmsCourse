package LargestProductOfThreeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestProductOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        List<Integer> ints = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            if (temp.length < 3) return;
            for (String s : temp) {
                ints.add(Integer.parseInt(s));
            }
        }

        Collections.sort(ints);
        long resMaxNumbers = (long) ints.get(ints.size() - 1) * ints.get(ints.size() - 2) * ints.get(ints.size() - 3);
        long resMinNumbers = (long) ints.get(0) * ints.get(1) * ints.get(ints.size() - 1);
        System.out.println((resMaxNumbers > resMinNumbers) ? ints.get(ints.size() - 1) + " " + ints.get(ints.size() - 2) + " " + ints.get(ints.size() - 3) : ints.get(ints.size() - 1) + " " + ints.get(1) + " " + ints.get(0));
    }
}
