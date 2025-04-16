package RajaSoftware.InterviewImp;

import java.util.Arrays;

public class CountTripletsInArray {
public static int countTriplets(int[] arr){
int cnt =0;
int n = arr.length;
Arrays.sort(arr);



for(int start=0;start<n;start++){
    for(int mid = start+1;mid<n;mid++){
        for(int end = mid+1;end<n;end++){
            if(arr[start] +arr[mid] == arr[end]){
                cnt++;
            }
        }
    }
}
return cnt;

}

    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 6, 10};

        int count = countTriplets(arr);
        System.out.println("Number of Triplets are " + count);

    }
}

/*time complexity is 0(n^3) */