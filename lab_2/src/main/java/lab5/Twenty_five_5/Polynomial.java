package lab5.Twenty_five_5;

import java.util.Arrays;

public class Polynomial {
    private final double[] coefficients; // Масив коефіцієнтів, починаючи зі старшого ступеня

    public Polynomial(double... coefficients) {
        this.coefficients = coefficients.clone();
    }

    public double[] getCoefficients() {
        return coefficients.clone();
    }

    public int getDegree() {
        return coefficients.length - 1;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, coefficients.length - 1 - i);
        }
        return result;
    }

    public Polynomial add(Polynomial other) {
        int maxDegree = Math.max(this.getDegree(), other.getDegree());
        double[] result = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double thisCoef = i < coefficients.length ? coefficients[coefficients.length - 1 - i] : 0;
            double otherCoef = i < other.coefficients.length ? other.coefficients[other.coefficients.length - 1 - i] : 0;
            result[maxDegree - i] = thisCoef + otherCoef;
        }

        return new Polynomial(result);
    }

    public Polynomial multiply(Polynomial other) {
        int degree = this.getDegree() + other.getDegree();
        double[] result = new double[degree + 1];

        for (int i = 0; i < coefficients.length; i++) {
            for (int j = 0; j < other.coefficients.length; j++) {
                result[i + j] += coefficients[i] * other.coefficients[j];
            }
        }

        return new Polynomial(result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Arrays.equals(this.coefficients, that.coefficients);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coefficients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coefficients.length; i++) {
            double coef = coefficients[i];
            if (coef == 0) continue;
            if (sb.length() > 0 && coef > 0) sb.append(" + ");
            if (coef < 0) sb.append(" - ");
            sb.append(Math.abs(coef));
            int power = coefficients.length - 1 - i;
            if (power > 0) sb.append("x^").append(power);
        }
        return sb.toString();
    }
}
