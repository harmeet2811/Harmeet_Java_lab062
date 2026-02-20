class SwapNumbers {
    int a, b;

    // Constructor
    SwapNumbers(int x, int y) {
        a = x;
        b = y;
    }

    // Member function
    void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        SwapNumbers obj = new SwapNumbers(5, 10);

        System.out.println("Before Swapping:");
        obj.display();

        obj.swap();

        System.out.println("After Swapping:");
        obj.display();
    }
}