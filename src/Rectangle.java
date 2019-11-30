public class Rectangle {

    double width, height;
    
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }
}
