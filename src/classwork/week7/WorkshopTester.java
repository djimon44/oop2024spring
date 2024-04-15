package classwork.week7;

import java.util.ArrayList;
import java.util.List;

public class WorkshopTester {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle("Rectangle", 5, 3));
        shapes.add(new Circle("Circle", 4));
        shapes.add(new Rectangle("Large Rectangle", 10, 6));

        System.out.println("Original Shapes:");
        for (Shape shape : shapes) {
            shape.displayInfo();
        }

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                ((Resizable) shape).resize(1.5); // Resize by a scale factor of 1.5
            }
        }

        System.out.println("\nResized Rectangles:");
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                shape.displayInfo();
            }
        }
    }
}
