package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vital\\javaProjects\\JavaMarathon2021" +
                "\\src\\main\\resources\\numbers19.txt");
        try {
            Scanner scanner = new Scanner(file);
            Set<Integer> set = new HashSet<>();
            while (scanner.hasNextLine()) {
                set.add(Integer.parseInt(scanner.nextLine()));
            }
            int count = 0;
            for (Integer number : set) {
                if (number >= 500000000 && number <= 600000000)
                    count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
