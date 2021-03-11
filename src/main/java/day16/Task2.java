package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("file1.txt");
            PrintWriter pw2 = new PrintWriter("file2.txt");
            Random random = new Random();
            for (int i = 0; i < 1000; i++) {
                random.nextInt(100);
                pw.print(random.nextInt(100) + " ");
            }
            pw.close();
            File file = new File("file1.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int count = 0;
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
                count++;
                if (count % 20 == 0) {
                    pw2.print(sum * 1.0 / 20 + " ");
                    sum = 0;
                }
            }
            pw2.close();
            printResult(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0;
            for (String number : numbers) {
                sum += Double.parseDouble(number);
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
