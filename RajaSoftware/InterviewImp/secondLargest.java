package RajaSoftware.InterviewImp;

public class secondLargest {
    public static void main(String[] args) {
        int[]arr={21,14,25,27,20,43};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("largest : " +largest);
                System.out.println("secondLargest : " +secondLargest);
    }
}




/* second smallest


 * class Main {
    public static void main(String[] args) {
        int[]arr={22,23,43,45,65,70};
        
        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest = arr[i];
            }
            
        }
        System.out.println("smallest" +smallest);
               System.out.println("secondsmallest" +secondSmallest);
    }
}
 */