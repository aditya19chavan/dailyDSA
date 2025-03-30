package Array;




import java.util.*;

public class IncDecOrder {
    public static void rearrange(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort in increasing order
        
        int n = arr.length;
        int mid = (n + 1) / 2; // Midpoint of the array

        System.out.print("Rearranged array: ");
        
        // Print first half in increasing order
        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print second half in decreasing order
        for (int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 6, 5, 7, 3, 8};
        rearrange(arr);
    }
}
