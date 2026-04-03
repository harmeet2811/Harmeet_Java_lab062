import java.util.Scanner;
class Point {
    int x, y;

    void accept(int x1, int y1) {
        x = x1;
        y = y1;
    }

    void display() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    float radius;
    Point p;   

    Circle() {
        p = new Point();  
    }

    void accept(float r, int x, int y) {
        radius = r;
        p.accept(x, y);
    }

    void display() {
        p.display();
        System.out.println("Radius: " + radius);
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class MainThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        float r = sc.nextFloat();

        c.accept(r, x, y);

        System.out.println("\nCircle Details:");
        c.display();
        sc.close();
    }
}
