package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void dialogMethod() {
        Scanner in = new Scanner(System.in); // чтение из консольного потока ввода
        System.out.println("May I have your name?");
        String name = in.nextLine(); // чтение строки, т.к. имя м.б. из пробелов. Для чтения слова используется next()
        System.out.println("Hello, " + name + "!");
    }
}
