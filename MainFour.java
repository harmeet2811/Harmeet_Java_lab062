import java.util.Scanner;
interface Bank {
    void deposit(double amt);
    void withdraw(double amt);
    void displayBalance();
}

class Customer {
    int custId;
    String name;

    void acceptCustomer() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        custId = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + custId);
        System.out.println("Name: " + name);
    }
}

class Account extends Customer implements Bank {
    double balance;

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class MainFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account a = new Account();

        a.acceptCustomer();

        System.out.print("Enter initial deposit: ");
        double amt = sc.nextDouble();
        a.deposit(amt);

        System.out.print("Enter withdrawal amount: ");
        double w = sc.nextDouble();
        a.withdraw(w);

        System.out.println("\n--- Account Details ---");
        a.displayCustomer();
        a.displayBalance();
    }
}