package MonitoringOfStudents;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MonitoringOfStudents {
    public static void main(String[] args) throws IOException {
        int N, M;
        int[] tin;
        int[] tout;
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String[] temp = reader.readLine().split(" ");
            N = Integer.parseInt(temp[0]);
            M = Integer.parseInt(temp[1]);
            tin = new int[M];
            tout = new int[M];
            for (int i = 0; i < M; i++) {
                temp = reader.readLine().split(" ");
                tin[i] = Integer.parseInt(temp[0]);
                tout[i] = Integer.parseInt(temp[1]);
            }
        }

        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            events.add(new int[]{tin[i], -1});
            events.add(new int[]{tout[i], 1});
        }

        events.sort((entry1, entry2) -> {
            if (entry1[0] > entry2[0]) {
                return 1;
            } else if (entry1[0] < entry2[0]) {
                return -1;
            } else {
                return Integer.compare(entry1[1], entry2[1]);
            }
        });
        long countTeachersOnline = 0;
        long occupiedStudent = 0;
        long first = 0;
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i)[1] == -1) {
                if (countTeachersOnline == 0) {
                    first = events.get(i)[0];
                }
                countTeachersOnline++;
            } else {
                countTeachersOnline--;
                if (countTeachersOnline == 0) {
                    occupiedStudent += events.get(i)[0] - first + 1;
                }
            }
        }

        System.out.println(N - occupiedStudent);
    }
}