class PositiveNegative {
    int num;

    // Constructor
    PositiveNegative(int n) {
        num = n;
    }

    // Member function
    void check() {
        if (num >= 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is Negative");
    }

    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative(-10);
        obj.check();
    }
}