import java.util.Scanner;
interface Gross {
    double calculateGross();
}

class Employee {
    int empId;
    String name;
    double basic;

    void acceptEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basic);
    }
}

class Salary extends Employee implements Gross {
    double hra, da, gross;

    public double calculateGross() {
        hra = 0.20 * basic;   // 20% HRA
        da = 0.10 * basic;    // 10% DA
        gross = basic + hra + da;
        return gross;
    }

    void displaySalary() {
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }
}

public class MainFive {
    public static void main(String[] args) {

        Salary s = new Salary();

        s.acceptEmployee();
        s.calculateGross();

        System.out.println("\n--- Employee Salary Details ---");
        s.displayEmployee();
        s.displaySalary();
    }
}