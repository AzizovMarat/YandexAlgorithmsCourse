package CityOfChe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CityOfChe {
    public static void main(String[] args) throws IOException {
        int r;
        int[] n;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            r = Integer.parseInt(temp[1]);
            n = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int j = 1;
        long count = 0;
        for (int i = 0; i < n.length; i++) {
            while (j < n.length) {
                if (n[j] - n[i] > r) {
                    count += (long) n.length - j;
                    break;
                }
                j++;
            }
        }
        System.out.println(count);
    }
}