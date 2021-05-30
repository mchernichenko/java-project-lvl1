package hexlet.code;

import java.math.BigInteger;
import java.util.Random;

public class Utils {
    /**
     * Проверка вхождения элемента в массив.
     * @param value - значение
     * @param items - массив элементов
     * @return Возвращает true, если значение value содержится в массиве items, иначе false
     */
    public static boolean isInArray(int value, int[] items) {
        if (items == null || items.length == 0) {
            return false;
        }
        for (int item : items) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка, что число простое.
     * @param value
     * @return Возвращает true, если value простое, иначе false
     */
    public static boolean isPrime(int value) {
        boolean isPrime = true;

        if (value <= 1 || value != 2 && value % 2 == 0) {
            isPrime = false;
        } else {
            for (int i = 3; i * i < value; i += 2) {
                if (value % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
    /**
     * Генерация случайного числа в заданном диапазоне.
     * @param from минимальное значение случайного числа
     * @param to  максимальное значение случайного числа (не включая)
     * @return Возвращает случайное число в диапазоне [from, to)
     */
    public static int getRandom(int from, int to) {
        return new Random().nextInt(from) + (to - from - 1);
    }
    /**
     * Нахождение наибольшего общего делителя.
     * @param a
     * @param b
     * @return Наибольший общий делитель 'a' и 'b'
     */
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
