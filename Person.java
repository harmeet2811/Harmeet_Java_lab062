class Person {
    String name;
    int age;

    // Constructor 1
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Person(String n) {
        name = n;
        age = 18;
    }

    // Constructor 3
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Harmeet");
        Person p3 = new Person("Simran", 21);

        p1.display();
        p2.display();
        p3.display();
    }
}