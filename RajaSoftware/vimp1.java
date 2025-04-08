package RajaSoftware;

public class vimp1 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        vimp1 me = new vimp1();
        System.out.println(me.majorityElement(new int[]{3, 2, 3})); // Output: 3
        System.out.println(me.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // Output: 2
    }
}
