package BeautyIsAboveAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BeautyIsAboveAll {
    public static void main(String[] args) throws IOException {
        int trees;
        int[] n;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            trees = Integer.parseInt(reader.readLine().split(" ")[1]);
            n = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int bestL = 1, bestR = n.length, r = 0, l = 0;
        int[] colors = new int[trees + 1];

        while (r < n.length) {
            if (colors[n[r]] == 0) {
                colors[0]++;
            }
            colors[n[r++]]++;
            if (colors[0] == trees) {
                while (--colors[n[l++]] != 0) ;
                colors[0]--;
                if (bestR - bestL > r - l) {
                    bestR = r;
                    bestL = l;
                }
            }
        }
        System.out.println(bestL + " " + bestR);
    }
}