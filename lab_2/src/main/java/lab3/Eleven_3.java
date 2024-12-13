package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Eleven_3 {

    // Метод для знаходження позицій входжень символу в тексті
    public static ArrayList<Integer> findCharacterPositions(String text, char character) {
        ArrayList<Integer> positions = new ArrayList<>();

        // Перебираємо текст та знаходимо всі позиції символу
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                positions.add(i);
            }
        }

        return positions;
    }

    // Метод для виконання програми (зчитування даних)
    public static void processInput(String text, String[] symbols) {
        for (String symbol : symbols) {
            if (symbol.equals("-")) {
                break;
            }
            char character = symbol.charAt(0);
            ArrayList<Integer> positions = findCharacterPositions(text, character);
            // Тут ми просто обробляємо результат, не виводячи його в консоль
            // Наприклад, можемо повернути результат або обробити в іншому методі
            // Результат можна повертати або зберігати в списку/масиві
            // В даному випадку результат не виводиться
        }
    }
}
