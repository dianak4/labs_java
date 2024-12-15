package lab5.Twenty_five_5;

import java.util.Arrays;

public class RationalExpression {
    private final Polynomial numerator;   // Поліном чисельника
    private final Polynomial denominator; // Поліном знаменника

    public RationalExpression(Polynomial numerator, Polynomial denominator) {
        if (denominator == null || Arrays.equals(denominator.getCoefficients(), new double[]{0})) {
            throw new IllegalArgumentException("Знаменник не може бути нульовим!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Polynomial getNumerator() {
        return numerator;
    }

    public Polynomial getDenominator() {
        return denominator;
    }

    public double evaluate(double x) {
        double denominatorValue = denominator.evaluate(x);
        if (denominatorValue == 0) {
            throw new ArithmeticException("Ділення на нуль в знаменнику!");
        }
        return numerator.evaluate(x) / denominatorValue;
    }

    public RationalExpression add(RationalExpression other) {
        Polynomial newNumerator = this.numerator.multiply(other.denominator).add(
                this.denominator.multiply(other.numerator));
        Polynomial newDenominator = this.denominator.multiply(other.denominator);
        return new RationalExpression(newNumerator, newDenominator);
    }

    public RationalExpression multiply(RationalExpression other) {
        Polynomial newNumerator = this.numerator.multiply(other.numerator);
        Polynomial newDenominator = this.denominator.multiply(other.denominator);
        return new RationalExpression(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalExpression that = (RationalExpression) o;
        return numerator.equals(that.numerator) && denominator.equals(that.denominator);
    }

    @Override
    public int hashCode() {
        return numerator.hashCode() + denominator.hashCode();
    }

    @Override
    public String toString() {
        return numerator + " / (" + denominator + ")";
    }
}
