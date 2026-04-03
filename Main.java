import java.util.Scanner;
class Item {
    int code;
    float price;

    void accept(int c, float p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        float total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Item " + (i + 1));

            System.out.print("Enter code: ");
            int code = sc.nextInt();

            System.out.print("Enter price: ");
            float price = sc.nextFloat();

            items[i].accept(code, price);
        }

        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        System.out.println("----------------------");
        System.out.println("Total Price = " + total);
    }
}