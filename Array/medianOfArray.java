package Array;

public class medianOfArray {
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,6,7};
        int start = arr[0];
        int n = arr.length;
double median;


if(n% 2 ==0){
    int mid1 = n /2 - 1;
    int mid2 =n/2;
    median = (arr[mid1] + arr[mid2]) / 2.0;

}else{

}
       median =arr[ n/2];
        
        System.out.println(median);
    }
}
