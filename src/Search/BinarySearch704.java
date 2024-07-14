package Search;

public class BinarySearch704 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n-1;
        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight)/2;
            if(target == nums[iMid])
            {
                return iMid;
            }else if( target > nums[iMid])
            {
                iLeft = iMid + 1;
            }else{
                iRight = iMid - 1;
            }
        }
        return -1;
    }
    public static int searchBinaryDeQuy(int[] nums, int target, int iLeft, int iRight) {
        if(iLeft <= iRight)
        {
            return -1;
        }

        int iMid = (iLeft+iRight)/2;
        if(target == nums[iMid]) return iMid;
        else if(target > nums[iMid])
        {
            return searchBinaryDeQuy(nums, target,iMid+1,iRight);
        }else
        {
            return searchBinaryDeQuy(nums, target,iLeft,iMid -1); 
        }

    }

    public static int searchBinaryDeQuy(int[] nums, int target) 
    {
        int n = nums.length;
        return searchBinaryDeQuy(nums, target, 0, n-1);
    }


    public static void main(String[] args) {
        int [] a = {-1,0,3,5,9,12};
        System.out.println(search(a, 5));
    }
}
