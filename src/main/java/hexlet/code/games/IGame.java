package hexlet.code.games;

import java.util.Scanner;

public interface IGame {
    String getQuestion();
    String getTask();
    String getAnswer(Scanner in);
    String getCorrectAnswer();
    String getWrongMassage();
    String getCorrectMassage();
    String getFinishMessage();
}
