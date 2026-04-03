public class ReverseWords {
    public static void main(String[] args) {

        // Joining all command-line arguments into one string
        String input = String.join(" ", args);

        String[] words = input.split(" ");

        System.out.print("Reversed sentence: ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}