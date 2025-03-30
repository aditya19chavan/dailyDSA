package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,10};
        int reversed;
        int start = 0,end = arr.length - 1;
        while(start<end){
        int temp = arr[start];
        arr[start] = arr[end];
     arr[end] = end;
     start++;
     end--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
