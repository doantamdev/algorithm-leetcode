package LeetCode;
public class RemoveElement27 {
    // public static int removeElement(int[] nums, int val) {
    //     int newLength = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != val) {
    //             nums[newLength] = nums[i];
    //             newLength++;
    //         }
    //     }
    //     return newLength;
    // }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
       for (int i = 0; i < nums.length; i++) {
        if(nums[i] != val)
        {
            nums[k] = nums[i];
            k++;
        }
       }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3,2,3,2,3,1,1,4};
        int val = 3;
        int newNums = removeElement(nums,val);
        for (int i = 0; i < newNums; i++) {
            System.out.println(nums[i]);
        }
    }
}
