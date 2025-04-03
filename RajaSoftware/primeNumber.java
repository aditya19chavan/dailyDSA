package RajaSoftware;


import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers up to 100:");
        
        for (int num = 2; num <= 100; num++) {  // Start from 2 (smallest prime)
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;  // Numbers less than 2 are not prime

        for (int i = 2; i <= num/2; i++) {  // Optimized loop (sqrt method)
            if (num % i == 0) {
                return false;  // If divisible, it's not prime
            }
        }
        return true;  // If no divisors found, it's prime
    }
}

