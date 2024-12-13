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
}
