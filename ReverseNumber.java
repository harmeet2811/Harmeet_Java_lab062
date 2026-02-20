class ReverseNumber {
    int num;

    ReverseNumber(int n) {
        num = n;
    }

    void reverse() {
        int rev = 0, temp = num;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Reversed Number = " + rev);
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber(1234);
        obj.reverse();
    }
}