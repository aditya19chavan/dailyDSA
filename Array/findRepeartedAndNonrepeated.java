package Array;
import java.util.*;
public class findRepeartedAndNonrepeated {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 9};


Arrays.sort(arr);

System.out.println("Repeating elements: ");
for(int i=0;i<arr.length - 1;i++){
if(arr[i] == arr[i+1]){
    System.out.println(arr[i] + " ");

}
}





    }
}
