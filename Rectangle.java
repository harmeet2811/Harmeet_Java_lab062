class Rectangle {
    void calculate(int length, int width) {
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.calculate(10, 5);
    }
}