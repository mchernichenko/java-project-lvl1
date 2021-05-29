package hexlet.code.games;

import java.util.Scanner;

public abstract class Game implements IGame {
    private final String user;
    private String userAnswer;

    public Game(String user) {
        this.user = user;
    }
    @Override
    public String getAnswer(Scanner in) {
        System.out.print("Your answer: ");
        userAnswer = in.next();
        return userAnswer;
    }
    @Override
    public void printFinishMessage() {
        System.out.println("Congratulations, " + user + "!");
    }

    public String getUser() {
        return user;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    @Override
    public void printCorrectMassage() {
        System.out.println("Correct!");
    }
}
