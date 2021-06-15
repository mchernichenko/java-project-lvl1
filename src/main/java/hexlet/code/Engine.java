package hexlet.code;

import hexlet.code.games.IGame;
import java.util.Scanner;

public class Engine {
    public static final int COUNT_RIGHT_ANSWER = 3;
    private final IGame game;
    private final String user;

    public Engine(IGame choiceGame, String pUser) {
        this.game = choiceGame;
        this.user = pUser;
    }

    /**
     * Общий алгоритм выполнение игр.
     */
    public void run() {
        int attempt = 0;
        boolean win = true;
        Scanner in = new Scanner(System.in);
        System.out.println(game.getQuestion());
        do {
            System.out.println(game.getTask());
            String correctAnswer = game.getCorrectAnswer();
            System.out.print("Your answer: ");
            String userAnswer = in.next();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println(game.getCorrectMassage());
                attempt++;
            } else {
                System.out.printf(game.getWrongMassage() + "%n", userAnswer, correctAnswer, this.user);
                win = false;
            }
        } while (attempt < COUNT_RIGHT_ANSWER && win);

        if (win) {
            System.out.printf(game.getFinishMessage() + "%n", this.user);
        }
    }
}
