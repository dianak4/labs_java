package lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Fifteen_2 {

    // Метод для знаходження перетину двох масивів
    public static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Додаємо елементи з масиву a в setA
        for (int num : a) {
            setA.add(num);
        }

        // Додаємо елементи з масиву b в setB
        for (int num : b) {
            setB.add(num);
        }

        // Знаходимо перетин множин
        setA.retainAll(setB);

        // Перетворюємо Set в ArrayList і повертаємо результат
        return new ArrayList<>(setA);
    }
}
