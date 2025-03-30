package Array;

import java.util.*;
class Main {
    public static void secondlargest(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
    
    for(int num:arr){
        if(num >  largest){
            secondLargest = largest;
            largest = num;
        } else if(num> secondLargest && num!=largest){
            secondLargest = num;
        }
    }
    
        System.out.println("second largest : " +secondLargest);
    }
}