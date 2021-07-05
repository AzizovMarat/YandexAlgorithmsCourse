package AmountOfNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AmountOfNumbers {
    public static void main(String[] args) throws IOException {
        int[] condition;
        int[] numbers;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            condition = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] prefix = new int[numbers.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i - 1];
        }

        int k = condition[1];
        int count = 0;
        int j = 1;
        for (int i = 0; i < prefix.length; i++) {
            while (j < prefix.length) {
                if (prefix[j] - prefix[i] == k) {
                    count++;
                    break;
                }
                if (prefix[j] - prefix[i] > k) break;
                j++;
            }
        }
        System.out.println(count);
    }
}