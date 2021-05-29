package hexlet.code.games;

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
    public String doExample(Scanner in) {
        int val1 = new Random().nextInt(MAX_RANDOM_VALUE);
        int val2 = new Random().nextInt(MAX_RANDOM_VALUE);
        System.out.println("Question: " + val1 + " " + val2);
        String correctAnswer = gcd(val1, val2) + "";
        setCorrectAnswer(correctAnswer);
        return correctAnswer;
    }

    /**
     * Нахождение наибольшего общего делителя.
     * @param a
     * @param b
     * @return Наибольший общий делитель 'a' и 'b'
     */
    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
