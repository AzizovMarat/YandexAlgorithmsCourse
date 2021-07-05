package Square;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Square {
    public static void main(String[] args) throws IOException {
        long t, n, m;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            n = Long.parseLong(reader.readLine());
            m = Long.parseLong(reader.readLine());
            t = Long.parseLong(reader.readLine());
        }

        long min = Math.min(n, m);
        long max = Math.max(n, m);
        long right = min + 1;
        long left = 0;

        System.out.println(rBinSearch(left, right, t, min, max));
    }

    public static long rBinSearch(long left, long right, long t, long min, long max) {
        long currLength = (left + right + 1) / 2;
        while (left != right) {
            if (check(currLength, t, min, max)) {
                left = currLength;
            } else {
                right = currLength - 1;
            }
            currLength = (left + right + 1) / 2;
        }
        return currLength;
    }

    public static boolean check(long curr, long t, long min, long max) {
        if (curr * 2 >= min) return false;
        long res = curr * min * 2 + curr * (max - 2 * curr) * 2;
        if (res < 1) return false;

        return res <= t;
    }
}