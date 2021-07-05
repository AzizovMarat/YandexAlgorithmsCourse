package VeryEasyTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VeryEasyTask {
    public static void main(String[] args) throws IOException {
        long N, x, y;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String[] temp;
            temp = reader.readLine().split(" ");
            N = Long.parseLong(temp[0]);
            x = Long.parseLong(temp[1]);
            y = Long.parseLong(temp[2]);
        }

        long bestPrinter = Math.min(x, y);
        long worsePrinter = Math.max(x, y);
        long right = N * worsePrinter + 1;
        long left = 0;

        System.out.println(lBinSearch(left, right, bestPrinter, worsePrinter, N));
    }

    public static long lBinSearch(long left, long right, long bestPrinter, long worsePrinter, long N) {
        long time = (left + right) / 2;
        while (left < right) {
            if (check(time, bestPrinter, worsePrinter, N)) {
                right = time;
            } else {
                left = time + 1;
            }
            time = (left + right) / 2;
        }
        return time;
    }

    public static boolean check(long time, long bestPrinter, long worsePrinter, long N) {
        long copies = 1;
        time -= bestPrinter;
        if (time < 0) return false;
        copies += time / bestPrinter + time / worsePrinter;

        return copies >= N;
    }
}