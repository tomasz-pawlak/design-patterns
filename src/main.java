public class main {
    public static void main(String[] args) {
        GuessGame guessGame = GuessGame.getInstance();

        guessGame.play();

        int score = guessGame.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if (guessGame == anotherGameReference) {
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
        System.out.println("Liczba punktów to:" + score);

    }


}
