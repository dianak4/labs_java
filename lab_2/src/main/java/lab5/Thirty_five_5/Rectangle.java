package lab5.Thirty_five_5;

public class Rectangle extends Figure implements ShapeMovement {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Implement the move method from ShapeMovement
    @Override
    public void move(double dx, double dy) {
        double newX = getX() + dx;
        double newY = getY() + dy;
        setX(newX);
        setY(newY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0 &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.hashCode(width) + Double.hashCode(height);
    }

    @Override
    public String toString() {
        return "Rectangle at (" + getX() + ", " + getY() + "), width=" + width + ", height=" + height;
    }
}

