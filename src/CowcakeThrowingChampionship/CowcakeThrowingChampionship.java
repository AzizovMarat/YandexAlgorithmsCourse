package CowcakeThrowingChampionship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CowcakeThrowingChampionship {
    public static void main(String[] args) throws IOException {
        int[] ints;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ints = new int[Integer.parseInt(reader.readLine())];
            String[] temp = reader.readLine().split(" ");
            if (ints.length != temp.length) return;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(temp[i]);
            }
        }
        System.out.println(getRes(ints));
    }

    public static int getRes(int[] ints) {
        int[] ints1 = ints.clone();
        Arrays.sort(ints1);
        int max = ints1[ints1.length - 1];
        int best = 0;
        boolean check = false;
        for (int i = 1; i < ints.length - 1; i++) {
            if (ints[i - 1] == max) check = true;
            if ((ints[i] % 10) == 5) {
                if (check && ints[i + 1] < ints[i]) {
                    best = Math.max(best, ints[i]);
                }
            }
        }
        if (best == 0) return 0;
        int maxPlace = 0;
        for (int i = ints1.length - 1, j = 0; i >= 0; i--, j++) {
            if (ints1[i] == best) {
                maxPlace = j + 1;
                break;
            }
        }

        return maxPlace;
    }
}
