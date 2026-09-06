class Shape
{
    double area;

    Shape()
    {
        this.area = 0;
    }

    Shape(double area)
    {
        this.area = area;
    }

    double getArea()
    {
        return area;
    }

    void setArea(double area)
    {
        this.area = area;
    }

    double calculateArea()
    {
        return area;
    }

    void display()
    {
        System.out.println("Area : " + this.area);
    }
}


class Circle extends Shape
{
    double radius;

    Circle()
    {
        super();
        this.radius = 0;
    }

    Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    void setRadius(double radius)
    {
        this.radius = radius;
    }

    double calculateArea()
    {
        return 3.14 * radius * radius;
    }

    void display()
    {
        System.out.println("Radius : " + this.radius);
        System.out.println("Area : " + this.calculateArea());
    }
}


class Triangle extends Shape
{
    double base;
    double height;

    Triangle()
    {
        super();
        this.base = 0;
        this.height = 0;
    }

    Triangle(double base, double height)
    {
        super();
        this.base = base;
        this.height = height;
    }

    double getBase()
    {
        return base;
    }

    void setBase(double base)
    {
        this.base = base;
    }

    double getHeight()
    {
        return height;
    }

    void setHeight(double height)
    {
        this.height = height;
    }

    double calculateArea()
    {
        return (base * height) / 2;
    }

    void display()
    {
        System.out.println("Base : " + this.base);
        System.out.println("Height : " + this.height);
        System.out.println("Area : " + this.calculateArea());
    }
}


class Rectangle extends Shape
{
    double length;
    double breadth;

    Rectangle()
    {
        super();
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double length, double breadth)
    {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    double getLength()
    {
        return length;
    }

    void setLength(double length)
    {
        this.length = length;
    }

    double getBreadth()
    {
        return breadth;
    }

    void setBreadth(double breadth)
    {
        this.breadth = breadth;
    }

    double calculateArea()
    {
        return length * breadth;
    }

    void display()
    {
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
        System.out.println("Area : " + this.calculateArea());
    }
}


public class TestShape
{
    public static void main(String[] args)
    {
        Shape[] arr;
        arr = new Shape[3];

        arr[0] = new Circle(5);

        arr[1] = new Triangle(10, 8);

        arr[2] = new Rectangle(12, 6);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Area = " + arr[i].calculateArea());
            arr[i].display();
            System.out.println();
        }
    }
}