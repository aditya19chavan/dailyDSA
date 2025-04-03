package RajaSoftware;
// This program efficiently finds the maximum and minimum elements in the array, calculates their difference, and determines if it is even or odd.
public class que1 {
    public static void main(String[] args) {
        int[] ARR = {1,10,5,2,8,1};
        System.out.println(findMaxDifference(ARR));
    }




    public static String findMaxDifference(int[] arr){
        if(arr == null || arr.length < 2){
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > max)  
            max = num;
            if(num < min)
            min=num;
        }

        int findMaxDifference = max - min;
        return (findMaxDifference % 2 == 0) ? "EVEN" : "ODD";
    }
}
