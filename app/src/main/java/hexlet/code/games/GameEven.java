package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameEven {
    public static final int MAX_RANDOM_VALUE = 100;
    public static final int COUNT_RIGHT_ANSWER = 3;
    public static final String NO = "no";
    public static final String YES = "yes";

    public static void startEvenGame(String user) {
        int attempt = 0;
        boolean win = true;

        System.out.println("Answer '" + YES + "' if number even otherwise answer '" + NO + "'.");
        Scanner in = new Scanner(System.in);
        do {
            int randomVal = new Random().nextInt(MAX_RANDOM_VALUE);
            System.out.println("Question: " + randomVal);
            String correctAnswer = (randomVal % 2 == 0) ? YES : NO;
            System.out.print("Your answer: ");
            String userAnswer = in.next();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                attempt++;
            } else {
                String msg = "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + user + "!";
                System.out.println(msg);
                win = false;
            }
        } while (attempt < COUNT_RIGHT_ANSWER && win);

        if (win) {
            System.out.println("Congratulations, " + user + "!");
        }
    }
}
