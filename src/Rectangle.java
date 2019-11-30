public class Rectangle {

    double width, height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }
}
