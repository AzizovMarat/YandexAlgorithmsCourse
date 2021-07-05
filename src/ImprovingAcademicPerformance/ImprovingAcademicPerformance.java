package ImprovingAcademicPerformance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ImprovingAcademicPerformance {
    public static void main(String[] args) throws IOException {
        long a, b, c;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            a = Long.parseLong(reader.readLine());
            b = Long.parseLong(reader.readLine());
            c = Long.parseLong(reader.readLine());
        }

        long score = a + b + c;
        long sum = a * 2 + b * 3 + c * 4;

        System.out.println(lBinSearch(0, sum, score));
    }

    public static long lBinSearch(long left, long sum, long score) {
        long right = score + 1;
        long d = (left + right) / 2;
        while (left < right) {
            if (check(d, sum, score)) {
                right = d;
            } else {
                left = d + 1;
            }
            d = (left + right) / 2;
        }
        return d;
    }

    public static boolean check(long d, long sum, long score) {
        sum += d * 5;
        score += d;

        return sum * 10 >= score * 35;
    }
}