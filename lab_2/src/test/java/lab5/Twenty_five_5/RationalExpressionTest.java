package lab5.Twenty_five_5;

import lab5.Twenty_five_5.Polynomial;
import lab5.Twenty_five_5.RationalExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RationalExpressionTest {

    @Test
    public void testRationalExpression() {
        Polynomial numerator = new Polynomial(1, -3, 2);  // x^2 - 3x + 2
        Polynomial denominator = new Polynomial(1, 1);    // x + 1
        RationalExpression expression = new RationalExpression(numerator, denominator);

        // Test numerator degree
        assertEquals(2, expression.getNumerator().getDegree());

        // Test denominator degree
        assertEquals(1, expression.getDenominator().getDegree());

        // Test evaluate method at x = 1
        assertEquals(0.0, expression.evaluate(1), 0.01); // Expected: (1 - 3 + 2) / (1 + 1) = 0

        // Test addition of rational expressions
        RationalExpression sum = expression.add(new RationalExpression(
                new Polynomial(1), new Polynomial(1, -1))); // 1 / (x - 1)
        assertNotNull(sum);

        // Test multiplication of rational expressions
        RationalExpression product = expression.multiply(expression);
        assertNotNull(product);
    }
}
