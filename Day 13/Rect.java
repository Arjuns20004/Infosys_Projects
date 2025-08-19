import java.util.Scanner;

abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shapeType = sc.next();
        Shape shape;

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            int l = sc.nextInt();
            int b = sc.nextInt();
            shape = new Rectangle(l, b);
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            int r = sc.nextInt();
            shape = new Circle(r);
        } else {
            System.out.println("Invalid Shape");
            return;
        }

        System.out.printf("%.2f\n", shape.getArea());
    }
}
