package RajaSoftware.InterviewImp;

import java.util.Arrays;

public class reverseString3 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};


        int left =0;
        int right= s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
System.out.println(Arrays.toString(s)  +" ");
    }
}


//two pointer 