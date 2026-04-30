import java.util.*;

// Abstract Class
abstract class AbstractProduct {
    int product_id;
    String title;
    double price;

    abstract void getData(Scanner sc);
    abstract void displayData();
}

// Book Class (Travel Guide)
class Book extends AbstractProduct {
    String author;

    void getData(Scanner sc) {
        System.out.println("\nEnter Travel Guide Book Details:");
        System.out.print("Product ID: ");
        product_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        title = sc.nextLine();

        System.out.print("Author: ");
        author = sc.nextLine();

        System.out.print("Price: ");
        price = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\n--- Travel Guide Book Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// CD Class
class CD extends AbstractProduct {
    int duration; // in minutes

    void getData(Scanner sc) {
        System.out.println("\nEnter CD Details:");
        System.out.print("Product ID: ");
        product_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        title = sc.nextLine();

        System.out.print("Duration (minutes): ");
        duration = sc.nextInt();

        System.out.print("Price: ");
        price = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\n--- CD Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Price: " + price);
    }
}

// Driver Class
public class MainTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AbstractProduct p1 = new Book();
        AbstractProduct p2 = new CD();

        // Input
        p1.getData(sc);
        p2.getData(sc);

        // Display
        System.out.println("\nSearching and Displaying by Product ID...");

        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();

        if (p1.product_id == searchId) {
            p1.displayData();
        } else if (p2.product_id == searchId) {
            p2.displayData();
        } else {
            System.out.println("Product not found.");
        }
    }
}