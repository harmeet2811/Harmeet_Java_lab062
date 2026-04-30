interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double lastSaleAmount;
    String lastClient;

        public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Processing Sale...");
        System.out.println("Sale Amount: ₹" + amount);
        System.out.println("Sale processed successfully.\n");
    }

    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("Generating Invoice...");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: ₹" + amount);
        System.out.println("Invoice generated successfully.\n");
    }

    void showSummary() {
        System.out.println("----- Summary of Operations -----");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: ₹" + lastSaleAmount);
        System.out.println("Commercial tasks completed efficiently.");
    }
}

public class MainNin {
    public static void main(String[] args) {

        CommercialExecutive exec = new CommercialExecutive();

        exec.processSale(50000.0);
        exec.generateInvoice("ABC Pvt Ltd", 50000.0);
        exec.showSummary();
    }
}