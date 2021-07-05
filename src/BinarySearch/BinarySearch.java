package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        int[] n, k;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.readLine();
            n = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            k = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int mid, left, right;
        for (int i = 0; i < k.length; i++) {
            left = 0;
            right = n.length - 1;
            while (true) {
                mid = (right + left) / 2;
                if (k[i] == n[mid]) {
                    System.out.println("YES");
                    break;
                } else if (left > right) {
                    System.out.println("NO");
                    break;
                } else {
                    if (k[i] > n[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
    }
}