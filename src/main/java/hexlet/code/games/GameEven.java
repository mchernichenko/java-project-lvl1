package hexlet.code.games;

import java.util.Random;

public final class GameEven extends  Game implements IGame {

    public GameEven(String user) {
        super(user);
    }
    @Override
    public String getQuestion() {
        return "Answer '%s' if number even otherwise answer '%s'.".formatted(YES, NO);
    }
    @Override
    public String getTask() {
        int randomVal = new Random().nextInt(MAX_RANDOM_VALUE);
        String correctAnswer = (randomVal % 2 == 0) ? YES : NO;
        setCorrectAnswer(correctAnswer);
        return "Question: " + randomVal;
    }
}
