package hexlet.code.games;

import java.util.Scanner;

public interface IGame {
    int MAX_RANDOM_VALUE = 100;
    String[] OPERATIONS = {"+", "-", "*"};

    void getQuestion();

    String doExample(Scanner in);

    String getAnswer(Scanner in);

    default void printCorrectMassage() {
        System.out.println("Correct!");
    }

    void printWrongMassage();

    void printFinishMessage();
}
