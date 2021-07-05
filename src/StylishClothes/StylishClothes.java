package StylishClothes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StylishClothes {
    public static void main(String[] args) throws IOException {
        int n, m;
        int[] shirts;
        int[] pants;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(reader.readLine());
            shirts = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            m = Integer.parseInt(reader.readLine());
            pants = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        n = 10000001;
        m = 0;
        int i, j = 0;
        for (i = 0; i < shirts.length; i++) {
            while (j < pants.length && pants[j] < shirts[i]) {
                if (Math.abs(pants[j] - shirts[i]) < Math.abs(n - m)) {
                    n = shirts[i];
                    m = pants[j];
                }
                j++;
            }
            if (j == pants.length) j--;
            if (pants[j] == shirts[i]) {
                System.out.println(shirts[i] + " " + pants[j]);
                return;
            } else if (Math.abs(pants[j] - shirts[i]) < Math.abs(n - m)) {
                n = shirts[i];
                m = pants[j];
            }
        }
        System.out.println(n + " " + m);
    }
}