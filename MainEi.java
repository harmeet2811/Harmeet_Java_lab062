import java.util.*;

// Interface Department
interface Department {
    String deptName = "";
    String deptHead = "";

    void printDeptData();
}

// Hostel Class
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

// Student Class
class Student extends Hostel implements Department {
    String studentName;
    String regdNo;
    String electiveSubject;
    double avgMarks;

    String deptName;
    String deptHead;

    // Get Data
    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Registration No: ");
        regdNo = sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();

        System.out.print("Enter Department Head: ");
        deptHead = sc.nextLine();

        getHostelData(sc);
    }

    // Print Data
    void printData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Registration No: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        printDeptData();
        printHostelData();
    }

    // Implement interface method
    public void printDeptData() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

// Driver Class
public class MainEi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Student s = new Student();
                    s.getData(sc);
                    list.add(s);
                    System.out.println("Student admitted successfully.");
                    break;

                case 2:
                    System.out.print("Enter Registration No to migrate: ");
                    String reg = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).regdNo.equals(reg)) {
                            list.remove(i);
                            System.out.println("Student migrated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found.");
                    break;

                case 3:
                    System.out.print("Enter Registration No to display: ");
                    String regd = sc.nextLine();
                    boolean found2 = false;

                    for (Student st : list) {
                        if (st.regdNo.equals(regd)) {
                            st.printData();
                            found2 = true;
                            break;
                        }
                    }

                    if (!found2)
                        System.out.println("Student not found.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}

