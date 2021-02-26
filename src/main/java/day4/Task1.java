package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        Random random = new Random();
        int numberMoreEight = 0;
        int numberEqualOne = 0;
        int numberEven = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(10);
            sum = sum + numbers[i];
            if (numbers[i] > 8)
                numberMoreEight++;
            if (numbers[i] == 1)
                numberEqualOne++;
            if (numbers[i] % 2 == 0)
                numberEven++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + numberMoreEight);
        System.out.println("Количество чисел равных 1: " + numberEqualOne);
        System.out.println("Количество четных чисел: " + numberEven);
        System.out.println("Количество нечетных чисел: " + (numbers.length - numberEven));
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
