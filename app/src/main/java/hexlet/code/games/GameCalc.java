package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameCalc extends Game implements IGame {
    private String correctAnswer;

    public GameCalc(String user) {
        super(user);
    }

    @Override
    public void getQuestion() {
        System.out.println("What is the result of the expression?");
    }
    @Override
    public String doExample(Scanner in) {
        int val1 = new Random().nextInt(MAX_RANDOM_VALUE);
        int val2 = new Random().nextInt(MAX_RANDOM_VALUE);
        int operation = new Random().nextInt(2);
        System.out.println("Question: " + val1 + " " + OPERATIONS[operation] + " " + val2);
        correctAnswer = correctAnswer(val1, val2, operation);
        return correctAnswer;
    }
    @Override
    public void printWrongMassage() {
        String msg = "'" + getUserAnswer() + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + getUser() + "!";
        System.out.println(msg);
    }

    private String correctAnswer(int val1, int val2, int operation) {
        int result;
        switch (OPERATIONS[operation]) {
            case "*":
                result = val1 * val2;
                break;
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            default:
                result = Integer.MAX_VALUE;
        }
        return "" + result;
    }
}
