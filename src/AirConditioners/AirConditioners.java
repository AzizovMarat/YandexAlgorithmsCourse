package AirConditioners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AirConditioners {
    public static void main(String[] args) throws IOException {
        int countClassrooms;
        int[] requiredConditioners;
        int countModels;
        int[] models = new int[1001];
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            countClassrooms = Integer.parseInt(reader.readLine());
            requiredConditioners = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            countModels = Integer.parseInt(reader.readLine());
            String[] temp;
            for (int i = 0, power, cost; i < countModels; i++) {
                temp = reader.readLine().split(" ");
                power = Integer.parseInt(temp[0]);
                cost = Integer.parseInt(temp[1]);
                if (models[power] == 0) {
                    models[power] = cost;
                } else {
                    models[power] = Math.min(models[power], cost);
                }
            }
        }

        System.out.println(slow(requiredConditioners, models));
    }

    public static int slow(int[] requiredConditioners, int[] models) {
        int minCost;
        int sum = 0;
        for (int i = 0, power; i < requiredConditioners.length; i++) {
            power = requiredConditioners[i];
            minCost = 1001;
            for (int j = power; j < models.length; j++) {
                if (models[j] != 0) {
                    if (minCost > models[j]) minCost = models[j];
                }
            }
            sum += minCost;
        }
        return sum;
    }
}