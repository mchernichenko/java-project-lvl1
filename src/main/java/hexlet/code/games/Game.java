package hexlet.code.games;

import java.util.Scanner;

public abstract class Game implements IGame {
    private final String user;
    private String userAnswer;
    private String correctAnswer;

    public Game(String pUser) {
        this.user = pUser;
    }

    /**
     *
     * @return - пользователь игры
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @return - Ответ пользователя
     */
    public String getUserAnswer() {
        return userAnswer;
    }

    /**
     *
     * @return - правильный ответ
     */
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
    public void printFinishMessage() {
        System.out.println("Congratulations, " + user + "!");
    }

    /**
     *
     */
    @Override
    public void printCorrectMassage() {
        System.out.println("Correct!");
    }

    /**
     *
     */
    @Override
    public void printWrongMassage() {
        String msg = "'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + user + "!";
        System.out.println(msg);
    }
}
