package RajaSoftware;
import java.util.Scanner;


public class PrimeSum {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 10, 11, 13, 17}; // Predefined array
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 1) { // Check if number is prime
                boolean isPrime = true;
                for (int j = 2; j <= num/2; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum += num;
                }
            }
        }

        System.out.println("Sum of prime numbers in the array: " + sum);
    }
}

