package RajaSoftware;

import java.util.Arrays;

public class vimp3 {



    public int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        vimp3 finder = new vimp3();
        System.out.println(finder.findDuplicate(new int[]{1,3,4,2,2})); // Output: 2
        System.out.println(finder.findDuplicate(new int[]{3,1,3,4,2})); // Output: 3
        System.out.println(finder.findDuplicate(new int[]{3,3,3,3,3})); // Output: 3
    }
}
