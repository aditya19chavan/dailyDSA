package RajaSoftware;

import java.util.Scanner;

public class CoolDudeNumbers {
    // Function to check if a number is a "Cool Dude"
    public static boolean isCoolDude(int num) {
        return num % 7 == 0 && !String.valueOf(num).contains("7");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("First " + N + " Cool Dude numbers:");

        int count = 0, num = 7; // Start from 7 since it's the first multiple of 7
        while (count < N) {
            if (isCoolDude(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

