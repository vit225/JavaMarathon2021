package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 0)
            System.out.println("Ошибка ввода");
        if (number >= 1 && number <= 4)
            System.out.println("Малоэтажный дом");
        if (number >= 5 && number <= 8)
            System.out.println("Среднеэтажный дом");
        if (number >= 9)
            System.out.println("Многоэтажный дом");


    }
}
