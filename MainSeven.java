interface Mango {
    void taste();
    void season();
}
class Winter implements Mango {
    public void taste() {
        System.out.println("Mango taste in winter is not fresh.");
    }

    public void season() {
        System.out.println("Winter is not the mango season.");
    }
}
class Summer implements Mango {
    public void taste() {
        System.out.println("Mango tastes sweet and juicy in summer.");
    }

    public void season() {
        System.out.println("Summer is the mango season.");
    }
}

public class MainSeven {
    public static void main(String[] args) {
        Mango m1 = new Winter();
        Mango m2 = new Summer();

        m1.taste();
        m1.season();

        m2.taste();
        m2.season();
    }
}