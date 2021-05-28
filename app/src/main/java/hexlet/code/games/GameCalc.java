package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameCalc implements IGame {
    private String user;
    private String correctAnswer;
    private String userAnswer;

    public GameCalc(String user) {
        this.user = user;
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
    public String getAnswer(Scanner in) {
        System.out.print("Your answer: ");
        userAnswer = in.next();
        return userAnswer;
    }

    @Override
    public void printWrongMassage() {
        String msg = "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + user + "!";
        System.out.println(msg);
    }

    @Override
    public void printFinishMessage() {
        System.out.println("Congratulations, " + user + "!");
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

    /*    public static void startCalcGame(String user) {
        int attempt = 0;
        boolean win = true;

        System.out.println("What is the result of the expression?");
        Scanner in = new Scanner(System.in);
        do {
            int val1 = new Random().nextInt(MAX_RANDOM_VALUE);
            int val2 = new Random().nextInt(MAX_RANDOM_VALUE);
            int operation = new Random().nextInt(2);
            String correctAnswer = correctAnswer(val1, val2, operation);

            System.out.println("Question: " + val1 + " " + OPERATIONS[operation] + " " + val2);
            System.out.print("Your answer: ");
            int answer = in.nextInt();
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
                attempt++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + user + "!");
                win = false;
            }
        } while (attempt < COUNT_RIGHT_ANSWER && win);

        if (win) {
            System.out.println("Congratulations, " + user + "!");
        }
    }*/
}
