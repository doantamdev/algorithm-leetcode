package LeetCode;
import java.util.Arrays;

public class TowSum01 {
    public int[] twoSum(int[] nums, int target) {
      int [] result = new int[2];
      for(int i =0 ; i < nums.length; i++)
        {
            for(int j = i + 1 ; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    result[0]= i;
                    result[1] = j;
                    return result;
                }
            }
        }
      return result;
    }

    public static void main(String[] args) {
        TowSum01 ts = new TowSum01();
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(ts.twoSum(arr,6)));
    }
}
