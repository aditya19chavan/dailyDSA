
//Add element in array
package Array;

import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};

        int element = 3;
        int index = 2;


        int newArr[] = new int[arr.length+1];

 // Copy elements up to the insertion point
        for(int i = 0;i< index;i++){
            newArr[i] = arr[i];
        }

        //insert the new element
        newArr[index] = element;


        for(int i=index;i<arr.length;i++)
{
    newArr[i+1] = arr[i];
}
System.out.println("Updated array: " +Arrays.toString(newArr));

    }
}
