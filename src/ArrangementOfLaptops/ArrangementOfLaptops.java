package ArrangementOfLaptops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrangementOfLaptops {
    public static void main(String[] args) throws IOException {
        int a1, b1, a2, b2;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            a1 = Integer.parseInt(temp[0]);
            b1 = Integer.parseInt(temp[1]);
            a2 = Integer.parseInt(temp[2]);
            b2 = Integer.parseInt(temp[3]);
        }

        int[] arr1 = ((Math.max(a1, a2) * (b1 + b2)) < (Math.max(b1, b2) * (a1 + a2))) ? new int[]{Math.max(a1, a2), b1 + b2} : new int[]{Math.max(b1, b2), a1 + a2};
        int[] arr2 = ((Math.max(b1, a2) * (a1 + b2)) < (Math.max(a1, b2) * (a2 + b1))) ? new int[]{Math.max(b1, a2), a1 + b2} : new int[]{Math.max(a1, b2), a2 + b1};
        if (arr1[0] * arr1[1] < arr2[0] * arr2[1]) {
            System.out.println(arr1[0] + " " + arr1[1]);
        } else {
            System.out.println(arr2[0] + " " + arr2[1]);
        }
    }
}

