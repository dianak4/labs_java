package lab5.Thirty_five_5;

public abstract class Figure {
    private double x;  // X-coordinate
    private double y;  // Y-coordinate

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Abstract move method to be implemented by derived classes
    public abstract void move(double dx, double dy);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Double.compare(figure.x, x) == 0 && Double.compare(figure.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(x) + Double.hashCode(y);
    }

    @Override
    public String toString() {
        return "Figure at (" + x + ", " + y + ")";
    }
}
