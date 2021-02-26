package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int sum;
        int sum2 = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < 98; i++) {
            sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += numbers[j];
                if (sum > sum2) {
                    sum2 = sum;
                    index = i + 1;
                }
            }
        }
        System.out.println(sum2);
        System.out.println(index);
    }
}
