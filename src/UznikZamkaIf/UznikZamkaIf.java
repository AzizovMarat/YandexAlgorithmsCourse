package UznikZamkaIf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UznikZamkaIf {
    public static void main(String[] args) throws IOException {
        List<Integer> abc = new ArrayList<>();
        List<Integer> de = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            abc.add(Integer.parseInt(reader.readLine()));
            abc.add(Integer.parseInt(reader.readLine()));
            abc.add(Integer.parseInt(reader.readLine()));
            de.add(Integer.parseInt(reader.readLine()));
            de.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(abc);
        Collections.sort(de);

        int res = 0;
        for (int i = 0; i < de.size(); i++) {
            for (int j = 0; j < abc.size(); j++) {
                if (abc.get(j) <= de.get(i)) {
                    res++;
                    abc.remove(j);
                    break;
                }
            }
        }
        if (res == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

