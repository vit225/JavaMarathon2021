package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }
        int max = numbers[0];
        int min = numbers[0];
        int endZero = 0;
        int sumEndZero = 0;
        for (int number : numbers) {
            if (number > max)
                max = number;
            else if (number < min)
                min = number;
            else if (number % 10 == 0) {
                endZero++;
                sumEndZero = sumEndZero + number;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + endZero);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumEndZero);

    }

}
