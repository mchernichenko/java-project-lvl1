package hexlet.code;

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
}
