

//Find common elemnts in two arrays


package Array;
import java.util.*;
public class FindRepeatedElement {
 public static void main(String[] args) {
    
HashSet<Integer> set1 = new HashSet<>();
HashSet<Integer> commonElements = new HashSet<>();

int []arr1 = {4,3,5,6,7,8,9};
int []arr2 = {4,3,5,6,1,2,0};

for(int num:arr1){
    set1.add(num);
}
for(int num:arr2){
    if(set1.contains(num)){
        commonElements.add(num);
    }
}
System.out.println(commonElements);
 }   
}
