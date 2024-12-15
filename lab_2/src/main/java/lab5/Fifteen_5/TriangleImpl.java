package lab5.Fifteen_5;

public class TriangleImpl implements Triangle {
    private double a; // Перша сторона
    private double b; // Друга сторона
    private double c; // Третя сторона

    public TriangleImpl(double a, double b, double c) {
        setSides(a, b, c); // Викликаємо метод для перевірки коректності
    }

    @Override
    public void setSides(double a, double b, double c) throws IllegalArgumentException {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Сторони трикутника некоректні: сума двох сторін має бути більшою за третю.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double[] getSides() {
        return new double[]{a, b, c};
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // Напівпериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Формула Герона
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 &&
                (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangleImpl triangle = (TriangleImpl) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(a) + Double.hashCode(b) + Double.hashCode(c);
    }

    @Override
    public String toString() {
        return String.format("Triangle[a=%.2f, b=%.2f, c=%.2f, Area=%.2f, Perimeter=%.2f]",
                a, b, c, calculateArea(), calculatePerimeter());
    }
}
