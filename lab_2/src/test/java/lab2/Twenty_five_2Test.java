package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Twenty_five_2Test {

    @Test
    public void testGetMonthAndDay() {
        // Тест для звичайного року (не високосний)
        assertEquals("Місяць: 2, День місяця: 28", Twenty_five_2.getMonthAndDay(59, false));  // 28 лютого
        assertEquals("Місяць: 3, День місяця: 1", Twenty_five_2.getMonthAndDay(60, false));  // 1 березня
        assertEquals("Місяць: 11, День місяця: 30", Twenty_five_2.getMonthAndDay(334, false));  // 30 листопада

        // Тест для високосного року
        assertEquals("Місяць: 2, День місяця: 29", Twenty_five_2.getMonthAndDay(60, true));   // 29 лютого (високосний рік)
        assertEquals("Місяць: 3, День місяця: 1", Twenty_five_2.getMonthAndDay(61, true));    // 1 березня (високосний рік)
        assertEquals("Місяць: 11, День місяця: 30", Twenty_five_2.getMonthAndDay(335, true)); // 30 листопада (високосний рік)
    }
}
