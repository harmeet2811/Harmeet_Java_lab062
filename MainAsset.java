abstract class Asset {
    String descriptor;
    String date;
    double current_value;

    Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int num_shares;
    double share_price;

    Stock(String descriptor, String date, double current_value,
          int num_shares, double share_price) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
    }

    void displayDetails() {
        System.out.println("\n--- Stock Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
        System.out.println("Total Stock Value: " + (num_shares * share_price));
    }
}

class Bond extends Asset {
    double interest_rate;

    Bond(String descriptor, String date, double current_value,
         double interest_rate) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
    }

    void displayDetails() {
        System.out.println("\n--- Bond Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Estimated Value: " + (current_value + current_value * interest_rate / 100));
    }
}

class Savings extends Asset {
    double interest_rate;

    Savings(String descriptor, String date, double current_value,
            double interest_rate) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
    }

    void displayDetails() {
        System.out.println("\n--- Savings Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println("Amount after Interest: " + (current_value + current_value * interest_rate / 100));
    }
}

public class MainAsset {
    public static void main(String[] args) {
        Asset a;

        a = new Stock("Equity", "17-04-2026", 10000, 50, 200);
        a.displayDetails();

        a = new Bond("Government Bond", "17-04-2026", 15000, 5);
        a.displayDetails();

        a = new Savings("Bank Savings", "17-04-2026", 20000, 4);
        a.displayDetails();
    }
}