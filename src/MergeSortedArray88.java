public class MergeSortedArray88 {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int i = 0; i < n; i++) {
            chenPhanTuVaoMang(n2[i], n1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int ai, int[] n1, int m) {
        boolean timK = false;
        for (int k = 0; k < m; k++) {
            if (n1[k] > ai) {
                for (int i = m; i > k; i--) {
                    n1[i] = n1[i - 1];
                }
                n1[k] = ai;
                timK = true;
                break;
            }
        }
        if (!timK) {
            n1[m] = ai;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        merge(n1, 3, n2, 3);
        for (int num : n1) {
            System.out.print(num + " ");
        }
    }
}
