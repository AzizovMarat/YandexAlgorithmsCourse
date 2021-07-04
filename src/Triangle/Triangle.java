package Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
        }

        if ((a + b) <= c) {
            System.out.println("NO");
            return;
        }
        if ((a + c) <= b) {
            System.out.println("NO");
            return;
        }
        if ((b + c) <= a) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");

    }
}
