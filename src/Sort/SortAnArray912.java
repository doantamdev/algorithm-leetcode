package Sort;

import java.util.Arrays;


public class SortAnArray912 {
    public static int [] mergeSort(int a[], int L, int R)
    {
        if (L > R) return new int[0];

        if (L == R) {
            int[] singleElement = {a[L]};
            return singleElement;
        }

        int k = (R + L) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);
        int n = a1.length + a2.length;

        int [] result = new int[n];
        int i = 0, i1=0, i2=0;
        while (i<n) {
            if(i1 < a1.length && i2 < a2.length) //a1 a2 != rỗng
            {
                if(a1[i1] <= a2[i2])
                {
                    result[i] = a1[i1];
                    i1++;
                }else{
                    result[i] = a2[i2];
                    i2++;
                }
            }else if(i1<a1.length) //a1 ko rỗng
                {
                    result[i] = a1[i1];
                    i1++;
                }else{
                    result[i] = a2[i2];
                    i2++;
                }
                i++;
            }
            return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length -1);
    }
    public static void main(String[] args) 
    {
        int [] c = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(c)));
    }

}
