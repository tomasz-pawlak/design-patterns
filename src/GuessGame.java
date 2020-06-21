import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {

    int score = 0;
    Scanner scanner = new Scanner(System.in);


    //prywatny konstruktor, zapobiegają tworzeniom instancji poza classa
    //aby zabezpieczyc sie przed zmiana na public, mozna stworzyc singletom jako enum
    private GuessGame() {

    }

    //zapobiega problemom z wielowatkowoscia, getinstance nie potrzebuje sprawdzc czy jest nullem, gdyz classloader wczytuje ja
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


    //tworzenie jednej instancji
    //aby zapobiec problemom dodac synchronized lub podwojny check 2xif z synchornized
    public static GuessGame getInstance() {
        return instance;
    }


}
