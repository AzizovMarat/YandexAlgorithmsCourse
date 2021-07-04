package PhoneNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneNumbers {
    public static void main(String[] args) throws IOException {
        long newNumber;
        long number1;
        long number2;
        long number3;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            newNumber = getProcessedNumber(reader.readLine().replaceAll("\\D+", ""));

            number1 = getProcessedNumber(reader.readLine().replaceAll("\\D+", ""));
            number2 = getProcessedNumber(reader.readLine().replaceAll("\\D+", ""));
            number3 = getProcessedNumber(reader.readLine().replaceAll("\\D+", ""));
        }

        System.out.println((newNumber ==number1)?"YES":"NO");
        System.out.println((newNumber ==number2)?"YES":"NO");
        System.out.println((newNumber ==number3)?"YES":"NO");
    }

    public static long getProcessedNumber(String number) {
        long num = 0;
        if (number.length() > 7) {
            num = Long.parseLong(number) % 10000000000L;
        } else {
            num = Long.parseLong("495" + number);
        }
        return num;
    }
}

