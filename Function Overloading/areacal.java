class Shape
{
    double area;
}
class Triangle
{
    int base;
    int height;
}
class Rectangle
{
    int length;
    int breadth;
}
class Circle
{
    int radius;
}
class Area
{
    Shape s = new Shape();

    void calculateArea(Triangle t)
    {
        s.area = 0.5 * t.base * t.height;
        System.out.println("Triangle Area = " + s.area);
    }

    void calculateArea(Rectangle r)
    {
        s.area = r.length * r.breadth;
        System.out.println("Rectangle Area = " + s.area);
    }

    void calculateArea(Circle c)
    {
        s.area = 3.14 * c.radius * c.radius;
        System.out.println("Circle Area = " + s.area);
    }
}
class TestArea
{
    public static void main(String args[])
    {
        Triangle t = new Triangle();
        t.base = 10;
        t.height = 5;

        Rectangle r = new Rectangle();
        r.length = 8;
        r.breadth = 4;

        Circle c = new Circle();
        c.radius = 7;

        Area a = new Area();

        a.calculateArea(t);
        a.calculateArea(r);
        a.calculateArea(c);
    }
}