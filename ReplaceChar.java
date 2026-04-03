import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Replacing 'd' with 'f'
        String newStr = str.replace('d', 'f');

        System.out.println("\nModified string: " + newStr);
    }
}