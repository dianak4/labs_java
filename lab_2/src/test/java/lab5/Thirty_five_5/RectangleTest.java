package lab5.Thirty_five_5;

import lab5.Thirty_five_5.Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testRectangleMove() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 5);

        // Move the rectangle
        rectangle.move(3, 4);

        // Check new coordinates
        assertEquals(3, rectangle.getX());
        assertEquals(4, rectangle.getY());
    }

    @Test
    public void testRectangleEquality() {
        Rectangle rectangle1 = new Rectangle(0, 0, 4, 5);
        Rectangle rectangle2 = new Rectangle(0, 0, 4, 5);
        Rectangle rectangle3 = new Rectangle(1, 1, 4, 5);

        // Check if equal rectangles are equal
        assertEquals(rectangle1, rectangle2);

        // Check if different rectangles are not equal
        assertNotEquals(rectangle1, rectangle3);
    }

    @Test
    public void testRectangleToString() {
        Rectangle rectangle = new Rectangle(2, 3, 4, 5);

        // Check the string representation of the rectangle
        assertEquals("Rectangle at (2.0, 3.0), width=4.0, height=5.0", rectangle.toString());
    }

    @Test
    public void testRectangleDimensions() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 5);

        // Check dimensions of the rectangle
        assertEquals(4, rectangle.getWidth());
        assertEquals(5, rectangle.getHeight());

        // Modify dimensions and check again
        rectangle.setWidth(6);
        rectangle.setHeight(7);

        assertEquals(6, rectangle.getWidth());
        assertEquals(7, rectangle.getHeight());
    }
}
