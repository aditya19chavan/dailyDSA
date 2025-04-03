package RajaSoftware;


//Write a function that takes an array of numbers as input parameter and prints the numbers that have remainder of 4 when divided by 5.
// Example: 
//Input : [19,10,44,3,11,129]  output: 19 44 129
//Input : [13,4] output : 4
public class que3 {
    public static void main(String[] args) {
        int []arr1 = {19,10,44,3,11,129};
        int[]arr2 = {13,4};

        System.out.println("output for arr1: ");
checkArrayWithRemainder4(arr1);


System.out.println("output for arr2: ");
checkArrayWithRemainder4(arr2);
        
    }



    public static void checkArrayWithRemainder4(int[] arr){
        for(int num:arr){
            if(num%5 == 4){
                System.out.println(num);
            }
        }
    }
}
