package lab3;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class Thirty_five_3Test {

    @Test
    public void testFindSubstringArguments() {
        // Тест 1: Всі аргументи містять підрядок
        String[] args1 = {"abc", "abcdef", "xyzabc", "123abc"};
        ArrayList<String> result1 = Thirty_five_3.findSubstringArguments("abc", args1);
        assertEquals(3, result1.size());
        assertTrue(result1.contains("abcdef"));
        assertTrue(result1.contains("xyzabc"));
        assertTrue(result1.contains("123abc"));

        // Тест 2: Жоден аргумент не містить підрядок
        String[] args2 = {"abc", "def", "ghi"};
        ArrayList<String> result2 = Thirty_five_3.findSubstringArguments("xyz", args2);
        assertEquals(1, result2.size());
        assertEquals("Підрядок не міститься в жодному з аргументів.", result2.get(0));

        // Тест 3: Підрядок міститься в деяких аргументах
        String[] args3 = {"abc", "abc123", "defxyz", "123"};
        ArrayList<String> result3 = Thirty_five_3.findSubstringArguments("123", args3);
        assertEquals(2, result3.size());
        assertTrue(result3.contains("abc123"));
        assertTrue(result3.contains("123"));
    }
}
