package lab2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class Fifteen_2Test {

    @Test
    public void testFindIntersection() {
        // Приклад 1: Масиви з деякими спільними елементами
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        ArrayList<Integer> result = Fifteen_2.findIntersection(a, b);

        // Перевіряємо, чи правильний перетин
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(5);
        assertEquals(expected, result);

        // Приклад 2: Масиви без спільних елементів
        int[] c = {1, 2, 3};
        int[] d = {4, 5, 6};
        result = Fifteen_2.findIntersection(c, d);

        // Перевіряємо, чи перетин порожній
        expected.clear();
        assertEquals(expected, result);

        // Приклад 3: Один масив є підмножиною іншого
        int[] e = {1, 2, 3, 4, 5};
        int[] f = {2, 3};
        result = Fifteen_2.findIntersection(e, f);

        // Перевіряємо, чи правильний перетин
        expected.clear();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, result);

        // Приклад 4: Один або обидва масиви порожні
        int[] g = {};
        int[] h = {1, 2, 3};
        result = Fifteen_2.findIntersection(g, h);

        // Перевіряємо, чи перетин порожній
        expected.clear();
        assertEquals(expected, result);
    }
}
