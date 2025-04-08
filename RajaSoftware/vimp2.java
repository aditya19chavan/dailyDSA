package RajaSoftware;

public class vimp2 {

public int findDuplicate(int[] nums){
    int slow = nums[0];
    int fast = nums[0];
    do{
        slow = nums[slow];
        fast = nums[nums[fast]];

    }while(slow != fast);

    slow = nums[0];
    while(slow !=fast){
        slow = nums[slow];
        fast = nums[fast];
    }
    return slow;
}



    public static void main(String[] args) {
        vimp2 finder = new vimp2();
        System.out.println(finder.findDuplicate(new int[]{1,3,4,2,2})); // Output: 2
        System.out.println(finder.findDuplicate(new int[]{3,1,3,4,2})); // Output: 3
        System.out.println(finder.findDuplicate(new int[]{3,3,3,3,3})); // Output: 3
    }
}
