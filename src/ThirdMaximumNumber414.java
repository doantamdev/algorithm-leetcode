public class ThirdMaximumNumber414 {
    public static int thirdMax(int[] nums) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int num : nums) {
            insert(maxArr, num);
        }
        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        } else {
            return (int) maxArr[2];
        }
    }

    private static void insert(long[] maxArr, int val) {
        if (val == maxArr[0] || val == maxArr[1] || val == maxArr[2]) {
            return;
        }
        if (val > maxArr[0]) {
            maxArr[2] = maxArr[1];
            maxArr[1] = maxArr[0];
            maxArr[0] = val;
        } else if (val > maxArr[1]) {
            maxArr[2] = maxArr[1];
            maxArr[1] = val;
        } else if (val > maxArr[2]) {
            maxArr[2] = val;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        System.out.println(thirdMax(arr1)); 
    }
}
