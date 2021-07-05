package PointsAndSegments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PointsAndSegments {
    public static void main(String[] args) throws IOException {
        int N, M;
        List<int[]> segments;
        List<int[]> points;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String[] temp = reader.readLine().split(" ");
            N = Integer.parseInt(temp[0]);
            M = Integer.parseInt(temp[1]);
            segments = new ArrayList<>(N);
            int first, second;
            for (int i = 0; i < N; i++) {
                temp = reader.readLine().split(" ");
                first = Integer.parseInt(temp[0]);
                second = Integer.parseInt(temp[1]);
                segments.add(new int[]{Math.min(first, second), -1});
                segments.add(new int[]{Math.max(first, second), 1});
            }
            points = new ArrayList<>(M);
            temp = reader.readLine().split(" ");
            for (int i = 0; i < temp.length; i++) {
                first = Integer.parseInt(temp[i]);
                points.add(new int[]{first, i});
            }
        }

        segments.sort((e1, e2) -> {
            if (e1[0] > e2[0]) {
                return 1;
            } else if (e1[0] < e2[0]) {
                return -1;
            } else {
                return Integer.compare(e1[1], e2[1]);
            }
        });
        points.sort(Comparator.comparingInt(e -> e[0]));

        int countOfActiveSegments = 0;
        int j = 0;
        for (int i = 0; i < segments.size(); i++) {
            if (segments.get(i)[1] == -1) {
                while (j < points.size() && points.get(j)[0] < segments.get(i)[0]) {
                    points.get(j)[0] = countOfActiveSegments;
                    j++;
                }
                countOfActiveSegments++;
            } else {
                while (j < points.size() && points.get(j)[0] <= segments.get(i)[0]) {
                    points.get(j)[0] = countOfActiveSegments;
                    j++;
                }
                countOfActiveSegments--;

            }
        }
        while (j < points.size()) {
            points.get(j)[0] = 0;
            j++;
        }
        points.sort(Comparator.comparingInt(e -> e[1]));
        points.forEach(e -> System.out.print(e[0] + " "));
    }
}