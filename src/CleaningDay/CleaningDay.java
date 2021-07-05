package CleaningDay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CleaningDay {
    public static void main(String[] args) throws IOException {
        long N, R, C;
        List<Long> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String[] temp = reader.readLine().split(" ");
            N = Long.parseLong(temp[0]);
            R = Long.parseLong(temp[1]);
            C = Long.parseLong(temp[2]);
            while (reader.ready()) {
                list.add(Long.parseLong(reader.readLine()));
            }
        }

        Collections.sort(list);

        System.out.println(lBinSearch(0, list.get(list.size() - 1) - list.get(0), R, C, list));
    }

    public static long lBinSearch(long left, long right, long R, long C, List<Long> list) {
        long m = (left + right) / 2;
        while (left < right) {
            if (check(m, R, C, list)) {
                right = m;
            } else {
                left = m + 1;
            }
            m = (left + right) / 2;
        }
        return left;
    }

    public static boolean check(long m, long R, long C, List<Long> list) {
        long i = 0;
        int brigades = 0;
        while (i < list.size() - C + 1) {
            if (list.get((int) (i + C - 1)) - list.get((int) i) <= m) {
                brigades += 1;
                i += C;
            } else {
                i += 1;
            }
        }

        return brigades >= R;
    }
}