package classwork.week7;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
         this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
