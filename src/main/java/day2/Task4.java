package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        if (x >= 5)
            y = ((x * x) - 10) / (x + 7);
        if (x > -3 && x < 5)
            y = (x + 3) * ((x * x) - 2);
        if (x <= -3)
            y = 420.0;
        System.out.println(y);
    }
}
