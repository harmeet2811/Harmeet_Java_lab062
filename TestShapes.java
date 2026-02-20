class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class TestShapes {
    public static void main(String[] args) {
        Square s = new Square(4);
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(2.5);

        s.area();
        r.area();
        c.area();
    }
}