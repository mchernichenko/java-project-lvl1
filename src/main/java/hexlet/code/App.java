package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;
    private static final int[] MAIN_MENU_IDS = {1, 2, 3, 4, 5, 6, 0};

    public static void main(String[] args) {
        System.out.println(getMenu());
        int choiceItem = choiceGame();
        String user = Cli.getPlayerName();

        switch (choiceItem) {
            case GREET -> System.out.println("No game");
            case EVEN -> new Engine(new GameEven(), user).run();
            case CALC -> new Engine(new GameCalc(), user).run();
            case GCD -> new Engine(new GameGCD(), user).run();
            case PROGRESSION -> new Engine(new GameProgression(), user).run();
            case PRIME -> new Engine(new GamePrime(), user).run();
            case EXIT -> System.out.println("Bye!");
            default -> throw new Error("Unknown choiceItem " + choiceItem);
        }
    }
    /**
     * Выбор игры.
     * @return - возвращает идентификатор выбранной игры
     */
    private static int choiceGame() {
        int choiceItem;
        Scanner inChoiceGame = new Scanner(System.in);
        while (true) {
            System.out.print("Your choice: ");
            choiceItem = inChoiceGame.nextInt();
            if (Util.isInArray(choiceItem, MAIN_MENU_IDS)) {
                System.out.println("Welcome to the Brain Games!");
                break;
            }
            System.out.println("Wrong number. Try again!");
        }
        return choiceItem;
    }

    private static String getMenu() {
        return "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit";
    }
}
