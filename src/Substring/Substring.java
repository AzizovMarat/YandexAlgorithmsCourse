package Substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Substring {
    public static void main(String[] args) throws IOException {
        int n, k;
        String string;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            k = Integer.parseInt(temp[1]);
            string = reader.readLine();
        }

        char[] strSymbols = new char[string.length() + 1];
        for (int i = 0; i < string.length(); i++) {
            strSymbols[i + 1] = string.charAt(i);
        }
        int[] symbols = new int[26];
        int bestIndex = 1;
        int bestLine = 1;
        int index;
        int i = 1;
        int j = 1;
        while (i < strSymbols.length) {
            while (j < strSymbols.length) {
                index = strSymbols[j] - 97;
                symbols[index]++;
                if (symbols[index] > k) {
                    if (bestLine < j - i) {
                        bestIndex = i;
                        bestLine = j - i;
                    }
                    j++;
                    break;
                }
                if (j == strSymbols.length - 1) {
                    if (bestLine < j + 1 - i) {
                        bestIndex = i;
                        bestLine = j + 1 - i;
                    }
                }
                j++;
            }
            while (i < strSymbols.length && --symbols[strSymbols[i++] - 97] != k) {
            }
        }
        System.out.println(bestLine + " " + bestIndex);
    }
}