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
        String user = Cli.getPlayerName();
        Scanner in = new Scanner(System.in);
        System.out.println(game.getQuestion());
        do {
            System.out.println("Question: " + game.getTask());
            String correctAnswer = game.getCorrectAnswer();
            System.out.print("Your answer: ");
            String userAnswer = in.next();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println(game.getCorrectMassage());
                attempt++;
            } else {
                System.out.printf(game.getWrongMassage() + "%n", userAnswer, correctAnswer, user);
                return;
            }
        } while (attempt < COUNT_RIGHT_ANSWER);

        System.out.printf(game.getFinishMessage() + "%n", user);
    }
}
