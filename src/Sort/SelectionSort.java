package Sort;

public class SelectionSort {
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
            printArray(i, arr);
        }  
    }  

    private static void printArray(int i, int[] arr) {
        System.out.println("Vong lap thu "+ i);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        selectionSort(arr1);
    }
}
