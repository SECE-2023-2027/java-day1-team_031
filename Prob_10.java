import java.util.Scanner;
public class Prob_10
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
        
        System.out.print("Input a string: ");
        String original = scanner.nextLine();
        
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reverse string: " + reversed);
        
        scanner.close();
    }
}