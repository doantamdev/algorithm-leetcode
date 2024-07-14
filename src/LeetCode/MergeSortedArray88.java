package LeetCode;
public class MergeSortedArray88 {
    // public static void merge(int[] n1, int m, int[] n2, int n) {
    //     for (int i = 0; i < n; i++) {
    //         chenPhanTuVaoMang(n2[i], n1, m);
    //         m++;
    //     }
    // }

    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m+n) -1;

        while (k >= 0) {
            if(j<0)
            {
                n1[k] = n1[i];
                i--;
            }
            else if(i < 0)
            {
                n1[k] = n2[j];
                j--;
            }
            else if(n1[i] > n2[j])
            {
                n1[k] = n1[i];
                i--;
            }else
            {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }

    // private static void chenPhanTuVaoMang(int ai, int[] n1, int m) {
    //     boolean timK = false;
    //     for (int k = 0; k < m; k++) {
    //         if (n1[k] > ai) {
    //             for (int i = m; i > k; i--) {
    //                 n1[i] = n1[i - 1];
    //             }
    //             n1[k] = ai;
    //             timK = true;
    //             break;
    //         }
    //     }
    //     if (!timK) {
    //         n1[m] = ai;  
    //     }
    // }

    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        merge(n1, 3, n2, 3);
        for (int i : n1) {
            System.out.print(i + " ");
        }
    }
}
