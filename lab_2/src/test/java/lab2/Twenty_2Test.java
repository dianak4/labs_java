package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Twenty2Test {
    @Test
    void testCalculateStatistics() {
        // Тест 1: Звичайний випадок
        int[] array1 = {1, 2, 3, 4, 5};
        double[] result1 = Twenty_2.calculateStatistics(array1);
        assertEquals(40.0, result1[0], 0.01); // 40% менше за середнє
        assertEquals(20.0, result1[1], 0.01); // 20% рівно середнє
        assertEquals(40.0, result1[2], 0.01); // 40% більше за середнє

        // Тест 2: Усі елементи однакові
        int[] array2 = {5, 5, 5, 5, 5};
        double[] result2 = Twenty_2.calculateStatistics(array2);
        assertEquals(0.0, result2[0], 0.01); // 0% менше за середнє
        assertEquals(100.0, result2[1], 0.01); // 100% рівно середнє
        assertEquals(0.0, result2[2], 0.01); // 0% більше за середнє

        // Тест 3: Масив з одним елементом
        int[] array3 = {3};
        double[] result3 = Twenty_2.calculateStatistics(array3);
        assertEquals(0.0, result3[0], 0.01); // 0% менше за середнє
        assertEquals(100.0, result3[1], 0.01); // 100% рівно середнє
        assertEquals(0.0, result3[2], 0.01); // 0% більше за середнє

        // Тест 4: Порожній масив (повинен викликати виключення)
        assertThrows(IllegalArgumentException.class, () -> {
            Twenty_2.calculateStatistics(new int[]{});
        });
    }
}
