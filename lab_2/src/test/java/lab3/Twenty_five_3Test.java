package lab3;

import static org.junit.Assert.*;
import org.junit.Test;

public class Twenty_five_3Test {

    @Test
    public void testFindLargestString() {
        // Тест з кількома аргументами
        String[] args1 = {"hello", "привіт", "world", "абвгде"};
        assertEquals("привіт", Twenty_five_3.findLargestString(args1));

        // Тест з одним аргументом
        String[] args2 = {"hello"};
        assertEquals("hello", Twenty_five_3.findLargestString(args2));

        // Тест з порожнім масивом
        String[] args3 = {};
        assertNull(Twenty_five_3.findLargestString(args3)); // Не знайдено рядка

        // Тест з аргументами, які не є латинськими або кириличними
        String[] args4 = {"12345", "!@#$%"};
        assertNull(Twenty_five_3.findLargestString(args4)); // Не знайдено рядка

        // Тест з кількома рядками, що містять лише латинські або лише кириличні букви
        String[] args5 = {"abc", "defghijk", "яблуко", "грушка"};
        assertEquals("defghijk", Twenty_five_3.findLargestString(args5));
    }
}
