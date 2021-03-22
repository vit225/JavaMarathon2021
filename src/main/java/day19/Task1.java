package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            Map<String, Integer> words = new HashMap<>();
            List<String> strings = new ArrayList<>();
            while (scanner.hasNext()) {
                strings.add(scanner.next().toLowerCase());
            }

            for (String string : strings) {
                if (words.get(string) != null) {
                    words.put(string, words.get(string) + 1);
                } else words.put(string, 1);
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                list.add(i, null);
                int v = 0;
                for (Map.Entry<String, Integer> entry : words.entrySet()) {
                    if (list.contains(entry))
                        continue;
                    if (entry.getValue() > v && list.get(i) != null) {
                        v = entry.getValue();
                        list.set(i, entry);
                    }
                    if (list.get(i) == null)
                        list.add(i, entry);
                }
                System.out.println(list.get(i)); // Чичиков - 601
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


