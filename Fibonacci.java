
class Fibonacci {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    void printSeries() {
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci(7);
        obj.printSeries();
    }
}