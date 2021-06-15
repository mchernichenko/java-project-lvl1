package hexlet.code.games;

import java.util.Random;

public final class GameGCD extends Game implements IGame {

    @Override
    public String getQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }
    @Override
    public String getTask() {
        int val1 = new Random().nextInt(MAX_RANDOM_VALUE);
        int val2 = new Random().nextInt(MAX_RANDOM_VALUE);
        String correctAnswer = gcd(val1, val2) + "";
        setCorrectAnswer(correctAnswer);
        return "Question: " + val1 + " " + val2;
    }

    /**
     * Нахождение наибольшего общего делителя.
     * @param a
     * @param b
     * @return Наибольший общий делитель 'a' и 'b'
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
