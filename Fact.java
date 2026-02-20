public class Fact {
    int findFact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        int number=5;
        Fact on=new Fact();
        int result=on.findFact(number);
        System.out.println("Factorial of " + number + " is :" + result);
    }
}
