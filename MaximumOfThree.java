class MaximumOfThree {
    int a, b, c;

    // Constructor
    MaximumOfThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    // Member function
    void findMax() {
        if (a > b && a > c)
            System.out.println("Maximum = " + a);
        else if (b > c)
            System.out.println("Maximum = " + b);
        else
            System.out.println("Maximum = " + c);
    }

    public static void main(String[] args) {
        MaximumOfThree obj = new MaximumOfThree(10, 25, 15);
        obj.findMax();
    }
}