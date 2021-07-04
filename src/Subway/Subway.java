package Subway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subway {
    public static void main(String[] args) throws IOException {
        int a, b, n, m;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            n = Integer.parseInt(reader.readLine());
            m = Integer.parseInt(reader.readLine());
        }

        int min1 = (a + 1) * n - a;
        int max1 = (a + 1) * n + a;
        int min2 = (b + 1) * m - b;
        int max2 = (b + 1) * m + b;

        if (max1 < min2 || max2 < min1) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(min1, min2) + " " + Math.min(max1, max2));
        }
    }
}

