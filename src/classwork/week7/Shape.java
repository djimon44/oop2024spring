package classwork.week7;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void displayInfo() {
        System.out.println(name + "; " + String.valueOf(getArea()) + "; " + String.valueOf(getPerimeter()));
    }
}
