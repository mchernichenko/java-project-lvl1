package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int choiceItem = choiceGame();
        String user = Cli.getPlayerName();

        switch (choiceItem) {
            case 1:
                System.out.println("No game");
                break;
            case 2:
                new Engine(new GameEven(user)).run();
                break;
            case 3:
                new Engine(new GameCalc(user)).run();
                break;
            case 4:
                new Engine(new GameGCD(user)).run();
                break;
            case 5:
                new Engine(new GameProgression(user)).run();
                break;
            case 6:
                new Engine(new GamePrime(user)).run();
                break;
            case 0:
                System.out.println("Bye!");
                break;
            default:
                break;
        }
    }
    /**
     * Выбор игры.
     * @return - возвращает идентификатор выбранного меню
     */
    private static int choiceGame() {
        int choiceItem;
        String mainMenu = "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit";
        int[] mainMenuIds = {1, 2, 3, 4, 5, 6, 0};
        System.out.println(mainMenu);
        Scanner inChoiceGame = new Scanner(System.in);
        while (true) {
            System.out.print("Your choice: ");
            choiceItem = inChoiceGame.nextInt();
            if (Utils.isInArray(choiceItem, mainMenuIds)) {
                System.out.println("Welcome to the Brain Games!");
                break;
            }
            System.out.println("Wrong number. Try again!");
        }
        return choiceItem;
    }
}
