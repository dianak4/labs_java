package lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Twenty_five_4Test {

    private Twenty_five_4 app;

    @BeforeEach
    void setUp() {
        app = new Twenty_five_4(); // Initialize app before each test
    }

    @Test
    void testViewProducts() {
        String expected = "Список товарів:\n" +
                "Артикул: 1, Article{name='Laptop', price=1200.0}\n" +
                "Артикул: 2, Article{name='Mouse', price=25.0}\n" +
                "Артикул: 3, Article{name='Keyboard', price=45.5}\n" +
                "Артикул: 4, Article{name='Monitor', price=300.0}\n" +
                "Артикул: 5, Article{name='Headphones', price=75.0}\n";
        assertEquals(expected, app.viewProducts());
    }

    @Test
    void testRemoveProduct() {
        // Test removing a product that exists
        String result = app.removeProduct(1);
        assertEquals("Товар видалено: Article{name='Laptop', price=1200.0}", result);

        // Test removing a product that doesn't exist
        result = app.removeProduct(10);
        assertEquals("Товар із таким артикулом не знайдено.", result);
    }

    @Test
    void testExit() {
        assertTrue(app.exit());
    }
}
