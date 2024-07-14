package LeetCode;
public class RichestCustomerWealth1672 {
    public static int maximumWealth(int[][] accounts) {
        int soKhachHang = accounts.length;
        int soTKNganHang = accounts[0].length;
        int[] tongTaiSan = new int[soKhachHang];

        for (int i = 0; i < soKhachHang; i++) {
            int tongTien = 0;
            for (int j = 0; j < soTKNganHang; j++) {
                tongTien += accounts[i][j];
            }
            tongTaiSan[i] = tongTien;
        }

        int max = 0;
        for (int j = 0; j < soKhachHang; j++) {
            if(tongTaiSan[j] > max)
            {
                max = tongTaiSan[j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] a =  {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(a));      
    }
}
