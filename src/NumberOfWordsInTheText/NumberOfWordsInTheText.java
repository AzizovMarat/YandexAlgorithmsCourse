package NumberOfWordsInTheText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NumberOfWordsInTheText {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            while (reader.ready()) {
                strings.add(reader.readLine());
            }
        }

        Set<String> set = new HashSet<>();
        for (String s : strings) {
            s = s.replaceAll("\\n", " ");
            s = s.replaceAll("\\s{2,}", " ");
            set.addAll(Arrays.asList(s.split(" ")));
            set.remove("");
        }
        System.out.println(set.size());

    }
}