package LeetCode;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}

public class TestRemoveDuplicates {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4}; 

        int k = solution.removeDuplicates(nums);

        assert k == expectedNums.length : "Length mismatch";
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i] : "Value mismatch at index " + i;
        }

       System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(nums, 0, k)));


        System.out.println("All assertions passed.");
    }
}
