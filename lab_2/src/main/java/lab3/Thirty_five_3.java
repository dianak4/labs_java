package lab3;

import java.util.ArrayList;

public class Thirty_five_3 {

    // Метод для аналізу аргументів
    public static ArrayList<String> findSubstringArguments(String substring, String[] args) {
        ArrayList<String> result = new ArrayList<>();

        // Перевіряємо кожен аргумент (окрім першого)
        for (int i = 1; i < args.length; i++) {
            if (args[i].contains(substring)) {
                result.add(args[i]);
            }
        }

        // Якщо результат порожній, додаємо повідомлення про відсутність підрядка
        if (result.isEmpty()) {
            result.add("Підрядок не міститься в жодному з аргументів.");
        }

        return result;
    }
}
