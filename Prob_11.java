 import java.util.Scanner;
public class Prob_11 {
    public static void main(String[] args) {
        // Create scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();
        
        countCharacters(inputString);
    
        scanner.close();
    }

    public static void countCharacters(String text) {
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        
        char[] characters = text.toCharArray();

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

        System.out.println("\nExpected Output");
        System.out.println("The string is : " + text);
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
    }
}
