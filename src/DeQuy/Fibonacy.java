package DeQuy;

public class Fibonacy {
    public static int Fibo(int n) 
    {
        if(n<=2) return 1;
        return  Fibo(n-1) + Fibo(n-2);
    }

    //Đệ quy tối ưu = cách lưu bộ nhớ
    static int [] F = new int[1000];
    public static int Fibo2(int n) 
    {   
        if(F[n] != 0) return F[n];
        if(n<=2) 
        {   
            F[1] = 1;
            F[2] =1;
            return 1;
        }
        return F[n] = Fibo2(n-1) + Fibo2(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibo2(8));
    }
}
