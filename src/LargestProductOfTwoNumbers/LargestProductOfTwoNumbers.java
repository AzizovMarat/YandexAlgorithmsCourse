package LargestProductOfTwoNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestProductOfTwoNumbers {
    public static void main(String[] args) throws IOException {
        List<Integer> ints = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            for (String s : temp) {
                ints.add(Integer.parseInt(s));
            }
        }

        Collections.sort(ints);
        long resMaxNumbers = (long) ints.get(ints.size() - 1) * ints.get(ints.size() - 2);
        long resMinNumbers = (long) ints.get(0) * ints.get(1);
        System.out.println((resMaxNumbers >= resMinNumbers) ? ints.get(ints.size() - 2) + " " + ints.get(ints.size() - 1) : ints.get(0) + " " + ints.get(1));
    }
}
