package hexlet.code.games;

import hexlet.code.Utils;
import java.util.Random;
import java.util.Scanner;

public class GameGCD extends Game implements IGame {

    public GameGCD(String user) {
        super(user);
    }
    @Override
    public void getQuestion() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
    @Override
    public String getTask(Scanner in) {
        int val1 = new Random().nextInt(MAX_RANDOM_VALUE);
        int val2 = new Random().nextInt(MAX_RANDOM_VALUE);
        System.out.println("Question: " + val1 + " " + val2);
        String correctAnswer = Utils.gcd(val1, val2) + "";
        setCorrectAnswer(correctAnswer);
        return correctAnswer;
    }
}
