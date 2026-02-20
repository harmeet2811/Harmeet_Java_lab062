class OddEven {
    void check(int num) {
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        OddEven obj = new OddEven();
        obj.check(7);
    }
}