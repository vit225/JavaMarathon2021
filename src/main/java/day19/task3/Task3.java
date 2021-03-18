package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\vital\\javaProjects\\JavaMarathon2021\\" +
                "src\\main\\resources\\taxi_cars.txt");
        try {
            Scanner scanner = new Scanner(file);
            HashMap<Integer, Point> cars = new HashMap<>();
            while (scanner.hasNextLine()) {
                cars.put(scanner.nextInt(), new Point(scanner.nextInt(), scanner.nextInt()));
            }
            Scanner scanner1 = new Scanner(System.in);
            int x1 = scanner1.nextInt();
            int y1 = scanner1.nextInt();
            int x2 = scanner1.nextInt();
            int y2 = scanner1.nextInt();
            int count = 0;
            for (Map.Entry<Integer, Point> car : cars.entrySet()) {
                int x = car.getValue().getX();
                int y = car.getValue().getY();
                if (x > x1 && x < x2 && y > y1 && y < y2) {
                    System.out.println(car.getKey());
                    count++;
                }
            }
            System.out.println("Количество машин в квадрате " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

