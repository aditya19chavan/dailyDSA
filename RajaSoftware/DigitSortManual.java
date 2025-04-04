package RajaSoftware;

public class DigitSortManual {
    public static void main(String[] args) {
        int num = 1378; // Change this number to test different inputs
        sortDigits(num);
    }

    public static void sortDigits(int num) {
        int[] digits = new int[10]; // Array to store digit frequencies
        
        // Extract digits and count occurrences
        int temp = num;
        while (temp > 0) {
            digits[temp % 10]++; // Increment count for the digit
            temp /= 10;
        }

        int ascending = 0, descending = 0;

        // Construct ascending number
        for (int i = 0; i <= 9; i++) {
            while (digits[i] > 0) {
                ascending = ascending * 10 + i;
                digits[i]--; // Reduce count for ascending
            }
        }

        // Recount the digits for descending order (restore frequencies)
        temp = num;
        while (temp > 0) {
            digits[temp % 10]++; // Restore digit counts
            temp /= 10;
        }

        // Construct descending number
        for (int i = 9; i >= 0; i--) {
            while (digits[i] > 0) {
                descending = descending * 10 + i;
                digits[i]--; // Reduce count for descending
            }
        }

        // Print results
        System.out.println("Ascending - " + ascending);
        System.out.println("Descending - " + descending);
    }
}
