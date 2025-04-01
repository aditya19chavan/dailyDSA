

//Java code that prints elements at odd and even positions in an array

package Array;

public class printoddevenElements {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
   int n=arr.length;
    System.out.println("Elemets at even positions:");
    for(int i=1;i<n;i=i+2){
        System.out.println(arr[i] + " ");
    }
    System.out.println("Elemets at odd positions:");
    for(int i=0;i<n;i=i+2){
        System.out.println(arr[i]+" ");
    }
  }  
  
}
