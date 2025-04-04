package RajaSoftware;

import java.util.Arrays;

public class sideline0and1 {
    public static void main(String[] args) {
        int[]arr={0,1,1,0,1,0,1,0};


        int left =0,right =arr.length - 1;
        while(left < right){
            while(left < right && arr[left] == 1)left++;
            while(left < right && arr[right] == 0)right--;

            if(left <  right){
                arr[left] = 1;
                arr[right] = 0;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
