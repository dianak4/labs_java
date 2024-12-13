package lab4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Fifteen_4Test {

    private Fifteen_4 store;

    @BeforeEach
    void setUp() {
        store = new Fifteen_4();
    }

    @Test
    void testAddProduct() {
        assertTrue(store.addProduct(6, "Cheese", 3.5f), "Should allow adding a unique product.");
        assertFalse(store.addProduct(1, "Apple", 1.2f), "Should not allow duplicate IDs.");
        assertFalse(store.addProduct(7, "Apple", 2.0f), "Should not allow duplicate names.");
    }

    @Test
    void testRemoveProduct() {
        assertTrue(store.removeProduct(1), "Should remove existing product by ID.");
        assertFalse(store.removeProduct(99), "Should not remove non-existing product.");
    }

    @Test
    void testIsNameUnique() {
        assertFalse(store.isNameUnique("Apple"), "Should return false for existing name.");
        assertTrue(store.isNameUnique("Yogurt"), "Should return true for non-existing name.");
    }

    @Test
    void testInitialProducts() {
        assertEquals(5, store.getProducts().size(), "Should have 5 initial products.");
        assertTrue(store.getProductNames().contains("Apple"), "Initial product names should include 'Apple'.");
    }
}
