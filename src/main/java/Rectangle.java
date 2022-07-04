
public class Rectangle {
    private final double length;
    private final double breadth;
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    double area()
    {
        return this.length*this.breadth;
    }

    double perimeter()
    {
        return 2*(this.length+this.breadth);
    }

}
