package p1;

class Shape {

    String color;

    Shape() {
        System.out.println("In Shape Constructor");
        this.color = "Not Given";
    }

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double calculateArea() {
        return 0;
    }

    void Display() {
        System.out.println("Shape Color : " + this.color);
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
}
// Shape Class Ends Here
class Circle extends Shape {

    double radius;

    Circle() {
        super();
        this.radius = 0;
    }

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
// Circle Class Ends Here
class Triangle extends Shape {

    double base;
    double height;

    Triangle() {
        super();
        this.base = 0;
        this.height = 0;
    }

    Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    double getBase() {
        return this.base;
    }

    void setBase(double base) {
        this.base = base;
    }

    double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
// Triangle Class Ends Here
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double getLength() {
        return this.length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
// Rectangle Class Ends Here
public class TestShape {

    public static void main(String[] args) {

        Shape s;

        s = new Circle("Red", 5);
        System.out.println(s);
        System.out.println("Circle Area : " + s.calculateArea());

        System.out.println();

        s = new Triangle("Blue", 10, 6);
        System.out.println(s);
        System.out.println("Triangle Area : " + s.calculateArea());

        System.out.println();

        s = new Rectangle("Green", 10, 5);
        System.out.println(s);
        System.out.println("Rectangle Area : " + s.calculateArea());
    }
}