package hexlet.code;

import hexlet.code.games.IGame;
import java.util.Scanner;

public class Engine {
    public static final int COUNT_RIGHT_ANSWER = 3;
    private final IGame game;

    public Engine(IGame choiceGame) {
        this.game = choiceGame;
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
            String userAnswer = game.getAnswer(in);
            if (correctAnswer.equals(userAnswer)) {
                System.out.println(game.getCorrectMassage());
                attempt++;
            } else {
                System.out.println(game.getWrongMassage());
                win = false;
            }
        } while (attempt < COUNT_RIGHT_ANSWER && win);

        if (win) {
            System.out.println(game.getFinishMessage());
        }
    }
}
