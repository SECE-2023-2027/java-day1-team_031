public class BinaryAddition {
    public static void main(String[] args) {

        String binary1 = "100010";
        String binary2 = "110010";

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        System.out.println("Input first binary number: " + binary1);
        System.out.println("Input second binary number: " + binary2);
        System.out.println("Sum of two binary numbers: " + result);
    }
}