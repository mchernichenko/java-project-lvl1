package hexlet.code.games;

public abstract class Game implements IGame {
    protected static final int MAX_RANDOM_VALUE = 100;
    protected static final String NO = "no";
    protected static final String YES = "yes";
    private String correctAnswer;

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
    protected void setCorrectAnswer(String inCorrectAnswer) {
        this.correctAnswer = inCorrectAnswer;
    }
    /**
     *
     */
    @Override
    public String getFinishMessage() {
        return "Congratulations, %s!";
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
        return  "'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!";
    }
}
