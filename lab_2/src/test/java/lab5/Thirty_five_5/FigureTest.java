package lab5.Thirty_five_5;

import lab5.Thirty_five_5.Figure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FigureTest {

    // Simple subclass for testing purposes
    private static class TestFigure extends Figure {
        public TestFigure(double x, double y) {
            super(x, y);
        }

        @Override
        public void move(double dx, double dy) {
            setX(getX() + dx);
            setY(getY() + dy);
        }
    }

    @Test
    public void testFigureMove() {
        Figure figure = new TestFigure(0, 0);

        // Move the figure
        figure.move(5, 3);

        // Check new coordinates
        assertEquals(5, figure.getX());
        assertEquals(3, figure.getY());
    }

    @Test
    public void testFigureEquals() {
        Figure figure1 = new TestFigure(0, 0);
        Figure figure2 = new TestFigure(0, 0);
        Figure figure3 = new TestFigure(1, 1);

        // Check if equal figures are equal
        assertEquals(figure1, figure2);

        // Check if different figures are not equal
        assertNotEquals(figure1, figure3);
    }

    @Test
    public void testFigureToString() {
        Figure figure = new TestFigure(2, 3);

        // Check the string representation of the figure
        assertEquals("Figure at (2.0, 3.0)", figure.toString());
    }
}
