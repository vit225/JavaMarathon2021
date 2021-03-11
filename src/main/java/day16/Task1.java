package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("text");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            int count = 0;
            for (String string : numbers) {
                sum += Integer.parseInt(string);
                count++;
            }
            double s = (sum * 1.0 / count);
            System.out.print(s + " --> ");
            System.out.printf("%.3f", s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

