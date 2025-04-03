/* 
//Write a function that takes an array of integers as input and prints the second-maximum difference between any two elements from an array
//Example: int  arr[] = {14,12,70,15,95,65,22,30};
First max-difference = 95-12=83
Second max-difference = 95 - 14 = 81
so output should be 81

 */


package RajaSoftware;

public class que4 {

    public static void finddSecondMaxDifference(int[]arr){
        if(arr.length < 2){
            System.out.println("Array should have atleast two characters");
            return;
        }

 // Step 1: Initialize max1 and min1 with first element
        int max1 = arr[0];
        int min1 = arr[0];

   // Step 2: Find the maximum and minimum elements manually
   for(int i=1;i<arr.length;i++){
    if(arr[i] > max1){
        max1 = arr[i];
    }

    if(arr[i] < min1){
        min1 = arr[i];
    }
   }

// Step 3: Find min2 (smallest element greater than min1)
int min2 =max1; //assume min2 is max initially

for(int i=0;i<arr.length;i++){
    if(arr[i] > min1 && arr[i] < min2){
        min2 = arr[i];
    }
}

        // Step 4: Compute differences
int maxDiff1 = max1 - min1;
int maxDiff2 = max1 - min2;



//Print result
System.out.println("first max difference: " +maxDiff1);
System.out.println("Second max difference: " +maxDiff2);
    }




    public static void main(String[] args) {
        int[] arr = {14,12,70,15,95,65,22,30};
        finddSecondMaxDifference(arr);
    }
}
