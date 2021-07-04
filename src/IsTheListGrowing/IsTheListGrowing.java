package IsTheListGrowing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IsTheListGrowing {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            for (int i = 0; i < temp.length; i++) {
                list.add(Integer.parseInt(temp[i]));
            }
        }

        System.out.println(getRes(list));
    }

    public static String getRes(List<Integer> list) {
        if (list.size() < 1) return "NO";
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) return "NO";
        }
        return "YES";
    }
}
