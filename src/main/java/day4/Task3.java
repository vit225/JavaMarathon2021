package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[12][8];
        int sum0;
        int sum1 = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum0 = 0;
            for (int j = 0; j < numbers.length - 4; j++) {
                numbers[i][j] = (int) (Math.random() * 50);
               sum0 +=numbers[i][j];
               if (sum0 > sum1) {
                   sum1 = sum0;
                   index = i;
               }
            }
        }
        System.out.println(index);
    }
}
