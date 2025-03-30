package Array;

public class avaerageOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum =0;
int n = arr.length;
        for(int i =0;i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println(n);
        System.out.println(sum);
        double avg =(double) sum/n;
        System.out.println("average = " +avg);
    }
}
