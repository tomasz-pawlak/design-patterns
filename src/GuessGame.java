import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {

    int score = 0;
    Scanner scanner = new Scanner(System.in);

    private GuessGame() {

    }

    private static GuessGame instance = new GuessGame();


    public void play() {
        for (int i = 0; i < 5; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
            int num = 0;
            System.out.println("Zgadnij cyfre");
            num = scanner.nextInt();

            if (num == randomNum) {
                System.out.println("Zgadles liczbe");
                score++;
            } else {
                System.out.println("Nie zgadles liczby");
            }

        }
    }

    public int getScore() {
        return score;

    }


    public static GuessGame getInstance() {
        return instance;
    }


}
