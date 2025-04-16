
//merge two list by taking alternatively valuesfrom another eg[2,3,5,8] [1,4,9,7] output shou;ld be [2,1,3,4,5,9,8,7]

package RajaSoftware.InterviewImp;
import java.util.ArrayList;


public class mergearrayAlternately {
    public static void main(String[] args) {
        int[] list1 = {2,3,5,8};
        int[] list2 = {1,4,9,7};


       ArrayList<Integer> mergedList = new ArrayList<>();

for(int i=0;i<list1.length;i++){
    mergedList.add(list1[i]);
    mergedList.add(list2[i]);
}
System.out.println(mergedList);
    }
}
