package RajaSoftware.InterviewImp;

import java.util.Arrays;
import java.util.Collections;

/*find the second maximum difference between adjacent elements in an integer array, you can follow these steps:
 * Sort the array in descending order

Calculate the differences between adjacent elements

Find the second largest value among those differences
 * 
 */

 import java.util.Arrays;
import java.util.Collections;

public class SecondMaxDifference {
    public static void main(String[] args) {
        Integer[] arr = {10, 3, 20, 6, 8};

        // Step 1: Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Step 2: Calculate adjacent differences
        int[] differences = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            differences[i] = arr[i] - arr[i + 1];
        }

        // Step 3: Sort differences in descending order to get the second maximum
        Arrays.sort(differences);
        int secondMaxDiff = differences[differences.length - 2];

        // Output
        System.out.println("Second maximum difference: " + secondMaxDiff);
    }
}
