package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getPlayerName() {
        Scanner in = new Scanner(System.in); // чтение из консольного потока ввода
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = in.nextLine(); // чтение строки, т.к. имя м.б. из пробелов. Для чтения слова используется next()
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
