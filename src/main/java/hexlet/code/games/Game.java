package hexlet.code.games;

import java.util.Scanner;

public abstract class Game implements IGame {
    protected static final int MAX_RANDOM_VALUE = 100;
    protected static final String NO = "no";
    protected static final String YES = "yes";
    private final String user;
    private String userAnswer;
    private String correctAnswer;

    public Game(String pUser) {
        this.user = pUser;
    }

    /**
     *
     * @return - правильный ответ
     */
    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    /**
     *
     * @param inCorrectAnswer - сохранить правильный ответ пользователя
     */
    public void setCorrectAnswer(String inCorrectAnswer) {
        this.correctAnswer = inCorrectAnswer;
    }

    /**
     *
     */
    @Override
    public String getAnswer(Scanner in) {
        System.out.print("Your answer: ");
        userAnswer = in.next();
        return userAnswer;
    }

    /**
     *
     */
    @Override
    public String getFinishMessage() {
        return "Congratulations, %s!".formatted(user);
    }

    /**
     *
     */
    @Override
    public String getCorrectMassage() {
        return "Correct!";
    }

    /**
     *
     */
    @Override
    public String getWrongMassage() {
        String str = "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!";
        return str.formatted(userAnswer, correctAnswer, user);
    }
}
