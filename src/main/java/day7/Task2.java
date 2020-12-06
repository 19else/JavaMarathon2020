package day7;

import java.util.Random;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 90;
        int max = 100;
        int diff = max - min;
        Player player1 = new Player(random.nextInt(diff + 1) + min);
        Player player2 = new Player(random.nextInt(diff + 1) + min);
        Player player3 = new Player(random.nextInt(diff + 1) + min);
        Player player4 = new Player(random.nextInt(diff + 1) + min);
        Player player5 = new Player(random.nextInt(diff + 1) + min);
        Player player6 = new Player(random.nextInt(diff + 1) + min);
        Player player7 = new Player(random.nextInt(diff + 1) + min);
        player1.run();
        player2.run();
        player3.run();
        player4.run();
        player5.run();
        player6.run();
        System.out.println();
        player1.info();
        while (player1.getStamina() > 0) {
            player1.run();
        }
        System.out.println("Количество игроков на поле: "+ Player.getCountPlayers());
    }
    }

