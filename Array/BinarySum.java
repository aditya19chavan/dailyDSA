package Array;
import java.util.Scanner;
public class BinarySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two binary numbers
        System.out.print("Enter first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter second binary number: ");
        String binary2 = scanner.nextLine();



        //Convert binary strings to integers
        int num1 = Integer.parseInt(binary1,2);
        int num2 =Integer.parseInt(binary2,2);


        int sum = num1 + num2;
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum in binary: " + binarySum);

    }
}
