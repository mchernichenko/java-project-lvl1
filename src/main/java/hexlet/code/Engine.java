package hexlet.code;

import hexlet.code.games.IGame;
import java.util.Scanner;

public class Engine {
    public static final int COUNT_RIGHT_ANSWER = 3;
    private final IGame game;

    public Engine(IGame game) {
        this.game = game;
    }

    public void run() {
        int attempt = 0;
        boolean win = true;
        Scanner in = new Scanner(System.in);
        game.getQuestion();
        do {
            String correctAnswer = game.getTask(in);
            String userAnswer = game.getAnswer(in);
            if (correctAnswer.equals(userAnswer)) {
                game.printCorrectMassage();
                attempt++;
            } else {
                game.printWrongMassage();
                win = false;
            }
        } while (attempt < COUNT_RIGHT_ANSWER && win);

        if (win) {
            game.printFinishMessage();
        }
    }
}
