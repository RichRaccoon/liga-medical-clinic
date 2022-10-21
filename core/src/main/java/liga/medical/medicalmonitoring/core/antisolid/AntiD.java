package liga.medical.medicalmonitoring.core.antisolid;

// Bad
class Rectangle {
    public double getArea() {
        // logic
        return 0;
    }
}

public class AntiD {
    private Rectangle rectangle;

    public AntiD(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void printArea() {
        System.out.println(rectangle.getArea());
    }
}

// Good
interface Shape {
    double getArea();
}

class Rectangle2 implements Shape {
    @Override
    public double getArea() {
        return 0;
    }
}

class Circle implements Shape {
    @Override
    public double getArea() {
        return 0;
    }
}

class AntiD2 {
    private Shape shape;

    public AntiD2(Shape shape) {
        this.shape = shape;
    }

    public void printArea() {
        System.out.println(shape.getArea());
    }
}
