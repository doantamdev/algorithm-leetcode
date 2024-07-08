import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        TowSum01 ts = new TowSum01();
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(ts.twoSum(arr,6)));
    }
}