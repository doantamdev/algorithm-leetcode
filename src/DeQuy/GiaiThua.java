package DeQuy;

public class GiaiThua {

    public static int giaiThua(int n)
    {
        if(n==0) return 1;
        return n*giaiThua(n-1);
    }
    public static void main(String[] args) {
        System.out.println(giaiThua(5));
    }
}
