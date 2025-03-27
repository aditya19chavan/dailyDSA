public class binarySearchRecursive {

public static int binarySearch(int[] arr , int left,int right, int target){
    if(left > right) return -1;
int mid = left  + (right - left) /2;
if(arr[mid] == target) return mid;
else if(arr[mid] < target) return binarySearch(arr, mid + 1, right, target);
else return binarySearch(arr, left, mid-1, target);



 }



    public static void main(String[] args) {
        int[]arr = {1,3,5,7,9,11};
        int target = 7;
        System.out.println( binarySearch(arr,0,arr.length - 2,target));
    }
}
