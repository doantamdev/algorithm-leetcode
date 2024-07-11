package Sort;
public class InsertionSort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int ai = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > ai) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ai;
            printArray(i, arr);
        }
    }

    private static void printArray(int i, int[] arr) {
        System.out.println("Vong lap thu "+ i);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        sort(arr);
    }
}
