package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GameEven extends  Game implements IGame {
    private static final String NO = "no";
    private static final String YES = "yes";

    public GameEven(String user) {
        super(user);
    }
    @Override
    public void getQuestion() {
        System.out.println("Answer '" + YES + "' if number even otherwise answer '" + NO + "'.");
    }
    @Override
    public String doExample(Scanner in) {
        int randomVal = new Random().nextInt(MAX_RANDOM_VALUE);
        System.out.println("Question: " + randomVal);
        String correctAnswer = (randomVal % 2 == 0) ? YES : NO;
        setCorrectAnswer(correctAnswer);
        return correctAnswer;
    }
}
