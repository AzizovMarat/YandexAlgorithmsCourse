package BankAccounts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BankAccounts {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
        }

        Map<String, Integer> accounts = new HashMap<>();
        String[] lines;
        String operation, name1, name2;
        for (int i = 0, sum; i < strings.size(); i++) {
            lines = strings.get(i).split(" ");
            operation = lines[0];
            switch (operation) {
                case "DEPOSIT" -> {
                    name1 = lines[1];
                    sum = Integer.parseInt(lines[2]);
                    accounts.put(name1, accounts.getOrDefault(name1, 0) + sum);
                }
                case "WITHDRAW" -> {
                    name1 = lines[1];
                    sum = Integer.parseInt(lines[2]);
                    accounts.put(name1, accounts.getOrDefault(name1, 0) - sum);
                }
                case "BALANCE" -> {
                    name1 = lines[1];
                    if (accounts.containsKey(name1)) {
                        System.out.println(accounts.get(name1));
                    } else {
                        System.out.println("ERROR");
                    }
                }
                case "TRANSFER" -> {
                    name1 = lines[1];
                    name2 = lines[2];
                    sum = Integer.parseInt(lines[3]);
                    accounts.put(name1, accounts.getOrDefault(name1, 0) - sum);
                    accounts.put(name2, accounts.getOrDefault(name2, 0) + sum);
                }
                case "INCOME" -> {
                    sum = Integer.parseInt(lines[1]);
                    for (Map.Entry<String, Integer> acc : accounts.entrySet()) {
                        if (acc.getValue() > 0) {
                            double value = acc.getValue();
                            value = value / 100 * sum;
                            acc.setValue(acc.getValue() + (int) value);
                        }
                    }
                }
            }
        }
    }
}