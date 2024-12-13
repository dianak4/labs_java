package lab3;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class Eleven_3Test {

    // Тест для пошуку символу в тексті
    @Test
    public void testFindCharacterPositions() {
        String text = "programming is fun";

        // Перевіряємо пошук символу 'g'
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(10);
        assertEquals(expected, Eleven_3.findCharacterPositions(text, 'g'));

        // Перевіряємо пошук символу 'o'
        expected.clear();
        expected.add(2);
        assertEquals(expected, Eleven_3.findCharacterPositions(text, 'o'));

        // Перевіряємо пошук символу, якого немає в тексті
        expected.clear();
        assertEquals(expected, Eleven_3.findCharacterPositions(text, 'z'));
    }
}
