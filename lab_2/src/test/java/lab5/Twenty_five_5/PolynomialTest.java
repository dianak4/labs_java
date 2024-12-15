package lab5.Twenty_five_5;

import lab5.Twenty_five_5.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PolynomialTest {

    @Test
    public void testPolynomial() {
        Polynomial p1 = new Polynomial(1, -3, 2); // x^2 - 3x + 2
        Polynomial p2 = new Polynomial(1, 1);     // x + 1

        // Test degree
        assertEquals(2, p1.getDegree());

        // Test evaluate method at x = 1
        assertEquals(0.0, p1.evaluate(1), 0.01); // Expected: 1 - 3 + 2 = 0

        // Test addition of polynomials
        Polynomial sum = p1.add(p2);
        assertEquals(new Polynomial(1, -2, 3), sum); // Expected: x^2 - 2x + 3

        // Test multiplication of polynomials
        Polynomial product = p1.multiply(p2);
        assertEquals(new Polynomial(1, -2, -1, 2), product); // Expected: x^3 - 2x^2 - x + 2
    }
}
