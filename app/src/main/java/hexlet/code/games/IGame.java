package hexlet.code.games;

import java.util.Scanner;

public interface IGame {
    int MAX_RANDOM_VALUE = 100;
    String[] OPERATIONS = {"+", "-", "*"};

    void getQuestion();
    String getTask(Scanner in);
    String getAnswer(Scanner in);
    void printWrongMassage();
    void printCorrectMassage();
    void printFinishMessage();
}
