package geometry;

public class Rectangle {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public void show() {
        System.out.println("Rectangle:");
        System.out.println("Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }
}
