package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[12][8];
        int[] num = new int[12];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                numbers[i][j] = (int) (Math.random() * 50);
                num[i] = num[i] + numbers[i][j];
            }
            if (num[i] >= sum) {
                sum = num[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
