import java.util.Scanner;

public class Prob_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int a = sc.nextInt();

        System.out.print("Input the second number: ");
        int b = sc.nextInt();

        System.out.print("Input the third number : ");
        int c = sc.nextInt();

        boolean result = (a % 10 == b % 10) ||
                         (b % 10 == c % 10) ||
                         (a % 10 == c % 10);

        System.out.println("The result is: " + result);
    }
}
