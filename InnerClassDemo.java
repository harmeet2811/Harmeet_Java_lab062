class Outer {

    void displayOuter() {
        System.out.println("This is Outer class method");
    }

    // Inner Class
    class Inner {
        void displayInner() {
            System.out.println("This is Inner class method");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        Outer outerObj = new Outer();
        outerObj.displayOuter();

        // Creating object of inner class
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.displayInner();
    }
}