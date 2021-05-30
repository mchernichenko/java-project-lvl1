package hexlet.code.games;

import hexlet.code.Utils;
import jdk.jshell.EvalException;

import java.util.Random;
import java.util.Scanner;

public class GamePrime extends Game implements IGame {
    private static final String NO = "no";
    private static final String YES = "yes";

    public GamePrime(String user) {
        super(user);
    }
    @Override
    public void getQuestion() {
        System.out.println("Answer '" + YES + "' if given number is prime. Otherwise answer '" + NO + "'.");
    }
    @Override
    public String getTask(Scanner in) {
        int val = new Random().nextInt(MAX_RANDOM_VALUE);
        String correctAnswer = Utils.isPrime(val) + "";
        setCorrectAnswer(correctAnswer);
        System.out.println("Question: " + val);
        return correctAnswer;
    }
}
