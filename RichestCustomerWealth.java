public class RichestCustomerWealth {
    public static void maximumWealth(int[][] arr ){
        int sokhachhang = arr.length;
        int songanhang=arr[0].length;
        int[] tongTaiSan = new int [sokhachhang];
        for (int i = 0; i < sokhachhang; i++) {
            int tinhTonghang =0;
            for (int j = 0; j < songanhang; j++) {
                tinhTonghang+=arr[i][j];
            }
            tongTaiSan[i] = tinhTonghang;
        }
        for (int i = 0; i < sokhachhang; i++) {
            System.out.print(tongTaiSan[i]);
        }

    }

    public static void main(String[] args) {
        int[][] a ={{1,2,3},{3,2,1}};
        int[][] b = new int[2][3];
        int row=a.length;
        int col = a[0].length;
        maximumWealth(a);
    }

}
