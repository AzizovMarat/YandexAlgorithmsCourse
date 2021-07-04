package MaximsTriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaximsTriangle {
    public static void main(String[] args) throws IOException {
        List<String> notes = new ArrayList<>();
        int count;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            count = Integer.parseInt(reader.readLine());
            for (int i = 0; i < count; i++) {
                notes.add(reader.readLine());
            }
        }

        double min = 30;
        double max = 4000;

        for (int i = 1; i < notes.size(); i++) {
            String[] temp = notes.get(i).split(" ");
            double current = Double.parseDouble(temp[0]);
            String condition = temp[1];
            temp = notes.get(i - 1).split(" ");
            double last = Double.parseDouble(temp[0]);
            if (current > last) {
                if (condition.equals("closer")) {
                    min = Math.max(min, (current - last) / 2 + last);
                } else {
                    max = Math.min(max, (current - last) / 2 + last);
                }
            } else {
                if (condition.equals("closer")) {
                    max = Math.min(max, (last - current) / 2 + current);
                } else {
                    min = Math.max(min, (last - current) / 2 + current);
                }
            }
        }
        System.out.println(min + " " + max);
    }
}
