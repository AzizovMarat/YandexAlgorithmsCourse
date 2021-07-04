package DetermineTheTypeOfSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DetermineTheTypeOfSequence {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int temp;
            while ((temp = Integer.parseInt(reader.readLine())) != -2000000000) {
                list.add(temp);
            }
        }

        System.out.println(getRes(list));
    }

    public static String getRes(List<Integer> list) {
        if (list.size() < 1) return "RANDOM";

        List<String> status = new ArrayList<>();
        status.add("CONSTANT");
        status.add("ASCENDING");
        status.add("WEAKLY ASCENDING");
        status.add("DESCENDING");
        status.add("WEAKLY DESCENDING");

        for (int i = 1; i < list.size(); i++) {
            if (!(list.get(i).equals(list.get(i - 1)))) {
                status.set(0, "");
            }
            if (!(list.get(i) > (list.get(i - 1)))) {
                status.set(1, "");
            }
            if (!(list.get(i) >= (list.get(i - 1)))) {
                status.set(2, "");
            }
            if (!(list.get(i) < (list.get(i - 1)))) {
                status.set(3, "");
            }
            if (!(list.get(i) <= (list.get(i - 1)))) {
                status.set(4, "");
            }
        }
        for (int i = 0; i < status.size(); i++) {
            if (!status.get(i).equals("")) return status.get(i);
        }

        return "RANDOM";
    }
}
