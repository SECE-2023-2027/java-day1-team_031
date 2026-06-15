 import java.util.Scanner;
public class Prob_11 {
    public static void main(String[] args) {
        // Create scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the input string: ");
        // Read the entire line of text, including lines with spaces
        String inputString = scanner.nextLine();
        
        // Call the counting logic method
        countCharacters(inputString);
        
        // Close scanner resource
        scanner.close();
    }

    public static void countCharacters(String text) {
        // Initialize counter variables
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        // Convert string to character array to iterate through it
        char[] characters = text.toCharArray();

        // Loop through each character and check its type
        for (char ch : characters) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isSpaceChar(ch)) {
                spaces++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else {
                others++;
            }
        }

        // Display results matched with expected format
        System.out.println("\nExpected Output");
        System.out.println("The string is : " + text);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}
