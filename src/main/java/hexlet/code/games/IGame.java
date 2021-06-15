package hexlet.code.games;

public interface IGame {
    String getQuestion();
    String getTask();
    String getCorrectAnswer();
    String getWrongMassage();
    String getCorrectMassage();
    String getFinishMessage();
}
