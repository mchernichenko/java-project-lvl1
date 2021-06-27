package hexlet.code.games;

import java.util.Random;

public final class GameCalc extends Game implements IGame {
    private static final String[] OPERATIONS = {"+", "-", "*"};

    @Override
    public String getQuestion() {
        return "What is the result of the expression?";
    }
    @Override
    public String getTask() {
        int val1 = new Random().nextInt(MAX_RANDOM_VALUE);
        int val2 = new Random().nextInt(MAX_RANDOM_VALUE);
        int operation = new Random().nextInt(2);
        String correctAnswer = Integer.toString(getCorrectAnswer(val1, val2, operation));
        setCorrectAnswer(correctAnswer);
        return val1 + " " + OPERATIONS[operation] + " " + val2;
    }

    private int getCorrectAnswer(int val1, int val2, int operation) {
        return switch (OPERATIONS[operation]) {
            case "*" -> val1 * val2;
            case "+" -> val1 + val2;
            case "-" -> val1 - val2;
            default -> throw new Error("Unknown operation " + OPERATIONS[operation]);
        };
    }
}
