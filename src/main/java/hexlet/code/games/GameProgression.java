package hexlet.code.games;

import java.util.Random;

public final class GameProgression extends Game implements IGame {
    private static final int CNT_MIN = 5; // минимальная длина прогрессии
    private static final int CNT_MAX = 10; // максимальная длина прогрессии

    @Override
    public String getQuestion() {
        return "What number is missing in the progression?";
    }
    @Override
    public String getTask() {
        int lenSeq = new Random().nextInt(CNT_MIN) + (CNT_MAX - CNT_MIN); // длина подпоследовательности
        int step = new Random().nextInt(CNT_MAX) + 1; // шаг арифметической прогрессии (>0)
        int indexStart = new Random().nextInt(CNT_MAX) + 1; // первый элемент подпоследовательности
        int indexHidden = new Random().nextInt(lenSeq) + indexStart; // скрытый элемент подпоследовательности
        int seqNext = 1 + (indexStart - 1) * step; // n-й член последовательности
        String correctAnswer = 1 + (indexHidden - 1) * step + ""; // значение скрытого элемента
        setCorrectAnswer(correctAnswer);

        StringBuilder sb = new StringBuilder();
        for (int i = indexStart; i < indexStart + lenSeq; i++) {
            if (i == indexHidden) {
                sb.append(" ..");
            } else {
                sb.append(" ").append(seqNext);
            }
            seqNext += step;
        }
        return sb.toString();
    }
}
