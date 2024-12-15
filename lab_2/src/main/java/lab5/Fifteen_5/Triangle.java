package lab5.Fifteen_5;

public interface Triangle {
    void setSides(double a, double b, double c) throws IllegalArgumentException; // Встановити сторони
    double[] getSides();                          // Отримати сторони
    double calculateArea();                       // Обчислити площу
    double calculatePerimeter();                  // Обчислити периметр
}
