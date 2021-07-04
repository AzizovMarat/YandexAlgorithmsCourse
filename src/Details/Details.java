package Details;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Details {
    public static void main(String[] args) throws IOException {
        int n, m, k;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] temp = reader.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            k = Integer.parseInt(temp[2]);
        }

        int res = 0;
        if (n >= m & m >= k) {
            while (n >= m) {
                res += m / k;
                n += m % k - m;
            }
        }
        System.out.println(res);
    }
}
