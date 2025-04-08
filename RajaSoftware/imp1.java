
/*
 * Q1. Given: A non-empty array of integer numbers,every element appears twice except 
 * for one.
 * Goal:Determine the element that only appear  once
 * (Don not use any inbuilt functionalities like collections or related things from any other languages)
 * Example 1:
 *    - Input : [2,2,1]
 *    - Output : 1
 *    - Explanation : Each element appears except for 1.
 * 
 * 
 * Example 2:
 *     - Input: [4,1,2,1,2]
 *     - Output: 4
 *     - Explanation : Each element appears except for 4.
 */


package RajaSoftware;




public class imp1 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int result = findSingleElement(arr);
        System.out.println("Unique element: " +result);
    }



    public static int findSingleElement(int[] arr){
        int Unique = 0;
        for(int i=0;i<arr.length;i++){
            Unique^=arr[i];
        }
        return Unique;
    }
}
