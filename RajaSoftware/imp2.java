package RajaSoftware;
/*
 * Q2. Given:
An unsorted array of integer numbers.

Goal:
Determine the length of the longest consecutive elements sequence.

Example 1:
Input = [100, 4, 200, 1, 3, 2]

Output = 4

Explanation:
The longest consecutive elements sequence is [1, 2, 3, 4].
Therefore its length is 4.

Example 2:
Input = [1, 0, 1, 2]

Output = 3

Explanation:
The longest consecutive elements sequence is [0, 1, 2].
Therefore its length is 3.
(We have ignored multiple occurrences of 1.)
 * 
 * 
 */
public class imp2{
public static int findLongestConsecutiveSequence(int[] nums){{
    //step 1: sort the array manuallay using bubble sort
    for(int i=0;i<nums.length - 1;i++){
for(int j=0;j<nums.length - 1 - i;j++){
    if(nums[j] > nums[j+1]){
        //swap nums[j] and nums[j+1]
        int temp =nums[j];
        nums[j] = nums[j+1];
        nums[j+1] = temp;
    }
}
    }
    //step 2: Find the longest consecutive sequence 
    

        // Step 2: Find the longest consecutive sequence
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                // Extend the current sequence
                currentLength++;
            } else if (nums[i] != nums[i - 1]) {
                // Sequence breaks; reset current length
                currentLength = 1;
            }
            // Update maximum length
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }

}

    public static void main(String[] args) {
        // Example inputs
        int[] input1 = {100, 4, 200, 1, 3, 2};
        System.out.println(findLongestConsecutiveSequence(input1)); // Output: 4

        int[] input2 = {1, 0, 1, 2};
        System.out.println(findLongestConsecutiveSequence(input2)); // Output: 3
    }
}
