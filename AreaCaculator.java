class AreaCalculator {

    void area(double side) {
        double result = side * side;
        System.out.println("Area of Square: " + result);
    }

    void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    void area(float radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(5);      
        obj.area(4, 6);     
        obj.area(3.5f);     
    }
}