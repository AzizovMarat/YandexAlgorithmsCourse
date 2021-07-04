package NearestNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestNumber {
    public static void main(String[] args) throws IOException {
        int[] ints;
        int x;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ints = new int[Integer.parseInt(reader.readLine())];
            String[] temp = reader.readLine().split(" ");
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(temp[i]);
            }
            x = Integer.parseInt(reader.readLine());
        }

        System.out.println(getRes(ints, x));
    }

    public static int getRes(int[] ints, int x) {
        int best = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (Math.abs(ints[i] - x) < Math.abs(best - x)) best = ints[i];
        }

        return best;
    }
}