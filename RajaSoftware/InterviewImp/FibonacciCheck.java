package RajaSoftware.InterviewImp;
// write a function which takes input as a number. if the given number is a Fibnacci number, print the number 
// if the given number is NOT a fibonacci number,print the sum of all even fibonacci numbers less than the given number.    
// Example: 21 is a fibonacci number input:21 output 21    (20 is not a fibonacci so output is 10(2+8))
import java.util.ArrayList;
import java.util.List;

public class FibonacciCheck {
    public static void main(String[] args) {
        int num = 20; // Change this number to test different inputs
        checkFibonacci(num);
    }

    public static void checkFibonacci(int num) {
        if (isFibonacci(num)) {
            System.out.println(num);
        } else {
            System.out.println(sumEvenFibonacci(num));
        }
    }

    // Function to check if a number is a Fibonacci number
    public static boolean isFibonacci(int num) {
        int num1 = 0, num2 = 1;
        while (num2 < num) {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return (num2 == num);
    }

    // Function to calculate the sum of even Fibonacci numbers less than num
    public static int sumEvenFibonacci(int num) {
        int num1 = 0, num2 = 1, sum = 0;
        while (num2 < num) {
            if (num2 % 2 == 0) {
                sum += num2;
            }
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return sum;
    }
}

