package SymmetricSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SymmetricSequence {
    public static void main(String[] args) throws IOException {
        int[] ints;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            ints = new int[Integer.parseInt(reader.readLine())];
            String[] temp = reader.readLine().split(" ");
            if (ints.length != temp.length) return;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(temp[i]);
            }
        }
        List<Integer> res = getRes(ints);
        if (res.size() == 0) {
            System.out.println(0);
        } else {
            System.out.println(res.size());
            for (int i : res) {
                System.out.print(i + " ");
            }
        }
    }

    public static List<Integer> getRes(int[] ints) {
        boolean check = false;
        List<Integer> res = new ArrayList<>();
        final int lastElement = ints.length - 1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == ints[lastElement]) {
                int limit = lastElement;
                check = true;
                for (int j = i + 1; (j < lastElement) && check; j++) {
                    if (ints[j] != ints[--limit]) {
                        check = false;
                    }
                }
            }
            if (check) {
                if (i == 0) return res;
                for (int j = i - 1; j >= 0; j--) {
                    res.add(ints[j]);
                }
                return res;
            }
        }
        return res;
    }
}
