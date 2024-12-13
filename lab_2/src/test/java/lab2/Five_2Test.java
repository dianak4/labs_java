package lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Five_2Test {

    @Test
    void testAllPositive() {
        int[] a = {3, 7, 1, 8};
        assertEquals("Всі елементи масиву є позитивними.", Five_2.checkArray(a));
    }

    @Test
    void testAllNegative() {
        int[] a = {-3, -7, -1, -8};
        assertEquals("Всі елементи масиву є негативними.", Five_2.checkArray(a));
    }

    @Test
    void testMixed() {
        int[] a = {-3, 7, -1, 8};
        assertEquals("Масив містить як позитивні, так і негативні числа.", Five_2.checkArray(a));
    }

    @Test
    void testEmptyArray() {
        int[] a = {};
        assertEquals("Масив порожній.", Five_2.checkArray(a));
    }
}
