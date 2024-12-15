package lab5.Fifteen_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleImplTest {
    @Test
    public void testValidTriangle() {
        TriangleImpl triangle = new TriangleImpl(3, 4, 5);
        assertArrayEquals(new double[]{3, 4, 5}, triangle.getSides(), 0.01);
        assertEquals(6.0, triangle.calculateArea(), 0.01); // Формула Герона для (3, 4, 5)
        assertEquals(12.0, triangle.calculatePerimeter(), 0.01);
    }

    @Test
    public void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> new TriangleImpl(1, 2, 10));
        assertThrows(IllegalArgumentException.class, () -> new TriangleImpl(-3, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> new TriangleImpl(0, 4, 5));
    }

    @Test
    public void testSetSides() {
        TriangleImpl triangle = new TriangleImpl(3, 4, 5);
        triangle.setSides(6, 8, 10);
        assertArrayEquals(new double[]{6, 8, 10}, triangle.getSides(), 0.01);
        assertEquals(24.0, triangle.calculatePerimeter(), 0.01);
        assertEquals(24.0, triangle.calculateArea(), 0.01); // Формула Герона
    }

    @Test
    public void testEquality() {
        TriangleImpl triangle1 = new TriangleImpl(3, 4, 5);
        TriangleImpl triangle2 = new TriangleImpl(3, 4, 5);
        TriangleImpl triangle3 = new TriangleImpl(6, 8, 10);

        assertEquals(triangle1, triangle2);
        assertNotEquals(triangle1, triangle3);
    }

    @Test
    public void testToString() {
        TriangleImpl triangle = new TriangleImpl(3, 4, 5);
        String expected = "Triangle[a=3.00, b=4.00, c=5.00, Area=6.00, Perimeter=12.00]";
        assertEquals(expected, triangle.toString());
    }
}
