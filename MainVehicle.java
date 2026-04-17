abstract class MotorVehicle{
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int number, double price){
        modelName=name;
        modelNumber=number;
        modelPrice=price;
    }
    abstract void display();
}

class Car extends MotorVehicle{
    double discountRate;
    Car (String name, int number, double price, double discountRate){
        super(name,number,price);
        this.discountRate=discountRate;
    }

    double discount(){
        return modelPrice * discountRate / 100;
    }
    void display(){
        System.out.println("Car Name:" + modelName);
        System.out.println("Model Number:" + modelNumber);
        System.out.println("Price:" + modelPrice);
        System.out.println("Discount Rate:" + discountRate + "%");
        System.out.println("Discount Amount:" + discount());
        System.out.println("Final Price: " + (modelPrice - discount()));
    }
}
public class MainVehicle{
    public static void main (String args[]){
        Car c= new Car("Creta" , 2023 , 2000000, 10);
        c.display();
    }
}