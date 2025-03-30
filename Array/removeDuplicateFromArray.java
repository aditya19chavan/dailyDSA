package Array;
import java.util.*;
public class removeDuplicateFromArray {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr =  { 1,2,4,5,6,7,7,8,9};

        for(int num:arr){
            set.add(num);
        }

        System.out.println(set);
    }
}
