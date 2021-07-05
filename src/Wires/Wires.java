package Wires;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Wires {
    public static void main(String[] args) throws IOException {
        long K;
        List<Long> list = new ArrayList<>(100);
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            K = Long.parseLong(reader.readLine().split(" ")[1]);
            while (reader.ready()) {
                list.add(Long.parseLong(reader.readLine()));
            }
        }

        Collections.sort(list);
        long min = 0;
        if (K < list.size()) {
            min = list.size() - K;
        }
        long right = list.get(list.size() - 1);
        long left = 0;

        System.out.println(rBinSearch(left, right, K, list, min));
    }

    public static long rBinSearch(long left, long right, long K, List<Long> list, long min) {
        long currLength = (left + right + 1) / 2;
        while (left != right) {
            if (check(currLength, K, list, min)) {
                left = currLength;
            } else {
                right = currLength - 1;
            }
            currLength = (left + right + 1) / 2;
        }
        return currLength;
    }

    public static boolean check(long curr, long K, List<Long> list, long min) {
        long sum = 0;
        for (int i = (int) min; i < list.size(); i++) {
            sum += list.get(i) / curr;
        }

        return sum >= K;
    }
}