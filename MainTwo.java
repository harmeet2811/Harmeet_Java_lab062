import java.util.Scanner;

class Tender {
    float cost;
    String company;

    void accept(float c, String name) {
        cost = c;
        company = name;
    }
}

public class MainTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Tender " + (i + 1));

            System.out.print("Enter company name: ");
            String name = sc.next();

            System.out.print("Enter cost: ");
            float cost = sc.nextFloat();

            t[i].accept(cost, name);
        }

        float min = t[0].cost;
        String minCompany = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                minCompany = t[i].company;
            }
        }

        System.out.println("\nCompany with minimum cost:");
        System.out.println("Company Name: " + minCompany);
        System.out.println("Cost: " + min);
    }
}
