package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conditioner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = reader.readLine().split(" ");
        String cond = reader.readLine();

        int tRoom = Integer.parseInt(nums[0]);
        int tCond = Integer.parseInt(nums[1]);

        if (cond.equals("fan")) {
            System.out.println(tRoom);
        }
        if (cond.equals("auto")) {
            System.out.println(tCond);
        }
        if (cond.equals("freeze")) {
            if (tRoom > tCond) {
                System.out.println(tCond);
            } else {
                System.out.println(tRoom);
            }
        }
        if (cond.equals("heat")) {
            if (tRoom > tCond) {
                System.out.println(tRoom);
            } else {
                System.out.println(tCond);
            }
        }
    }
}
