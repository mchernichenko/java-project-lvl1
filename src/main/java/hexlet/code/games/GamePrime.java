package hexlet.code.games;

import java.util.Random;

public final class GamePrime extends Game implements IGame {

    @Override
    public String getQuestion() {
        return "Answer '%s' if given number is prime. Otherwise answer '%s'.".formatted(YES, NO);
    }
    @Override
    public String getTask() {
        int val = new Random().nextInt(MAX_RANDOM_VALUE);
        String correctAnswer = isPrime(val) ? YES : NO;
        setCorrectAnswer(correctAnswer);
        return "Question: " + val;
    }

    /**
     * Проверка, что число простое.
     * @param value
     * @return Возвращает true, если value простое, иначе false
     */
    public static boolean isPrime(int value) {
        boolean isPrime = true;
        final int init = 3;

        if (value <= 1 || value != 2 && value % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = init; i * i <= value; i += 2) {
                if (value % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
