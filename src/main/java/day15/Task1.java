package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String s = File.separator;
        File file = new File("src" + s + "main" + s + "resources" + s + "shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter("src" + s + "main" + s + "resources" + s + "missing_shoes.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
