class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {
    
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  
        Dog d = new Dog();
        d.sound();  
    }
}