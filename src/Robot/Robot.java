package Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Robot {
    public static void main(String[] args) throws IOException {
        long k;
        String str;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            k = Long.parseLong(reader.readLine());
            str = reader.readLine();
        }

        long prevlen = 0;
        long ans = 0;
        for (long i = k; i < str.length(); i++) {
            if (str.charAt((int) i) == str.charAt((int) (i - k))) {
                prevlen += 1;
                ans += prevlen;
            } else {
                prevlen = 0;
            }
        }
        System.out.println(ans);
    }

}