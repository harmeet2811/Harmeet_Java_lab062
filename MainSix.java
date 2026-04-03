import java.util.Scanner;
interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll_no;
    int marks1, marks2;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Roll No: ");
        roll_no = sc.nextInt();

        System.out.print("Enter Marks 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        marks2 = sc.nextInt();
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }
}

class Result extends Student implements Exam {
    float per;

    public void percent_cal() {
        per = (marks1 + marks2) / 2.0f;
    }

    void display() {
        System.out.println("Percentage: " + per + "%");
    }
}

public class MainSix {
    public static void main(String[] args) {

        Result r = new Result();

        r.accept();
        r.percent_cal();

        System.out.println("\n--- Student Result ---");
        r.show();
        r.display();
    }
}
