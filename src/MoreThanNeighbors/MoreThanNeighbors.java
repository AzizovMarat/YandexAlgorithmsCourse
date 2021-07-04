package MoreThanNeighbors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MoreThanNeighbors {
    public static void main(String[] args) throws IOException {
        List<Integer> ints = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            for (int i = 0; i < temp.length; i++) {
                ints.add(Integer.parseInt(temp[i]));
            }
        }

        System.out.println(getRes(ints));
    }

    public static int getRes(List<Integer> ints) {
        int res = 0;
        for (int i = 1; i < ints.size() - 1; i++) {
            if (ints.get(i) > ints.get(i + 1) && ints.get(i) > ints.get(i - 1)) ++res;
        }

        return res;
    }
}