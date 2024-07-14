package LeetCode;
public class FindNumEven1295 {
    public static void main(String[] args) {
        int [] nums =  {1,22,3,4};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums)
        {
            int soLuongChuSo = tinhSoChan(num);
            if(soLuongChuSo % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    private static int tinhSoChan(int num)
    {
        int count = 0;
        int kq = num;

        while (kq!=0)
        {
            kq = num/10;
            num = kq;
            count++;
        }

        return count;
    }
}
