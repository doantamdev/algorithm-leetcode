package Sort;
public class NangCapBubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
            printArray(i,arr);
            if(isSorted)
            {
                break;
            }
        }
    }

    private static void printArray(int i, int[] arr) {
        System.out.println("Vong lap thu "+ i);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    

    public static void main(String[] args) {
        // int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
        int arr[] = { 3, 4, 5, 6, 7, 320, 20 };
        bubbleSort(arr);
    }
}
