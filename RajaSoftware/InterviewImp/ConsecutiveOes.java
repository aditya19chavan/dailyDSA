package RajaSoftware.InterviewImp;
// find the max count of the consecutive 1's in a given binary array.
public class ConsecutiveOes {
    public static void main(String[] args) {
        int[]arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};

        int maxCount = 0,currentCount = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){

                currentCount++;
                maxCount=Math.max(maxCount,currentCount);
            }else{
                 currentCount = 0;
            }
            
        }
        System.out.println(maxCount);
    }
}
