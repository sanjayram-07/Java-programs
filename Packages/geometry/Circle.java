package geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void show() {
        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }
}
