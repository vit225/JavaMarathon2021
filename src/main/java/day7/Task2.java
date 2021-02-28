package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(10) + 91);
        Player player2 = new Player(random.nextInt(10) + 91);
        Player player3 = new Player(random.nextInt(10) + 91);
        Player player4 = new Player(random.nextInt(10) + 91);
        Player player5 = new Player(random.nextInt(10) + 91);
        Player player6 = new Player(random.nextInt(10) + 91);
        player1.info();
    }
}
