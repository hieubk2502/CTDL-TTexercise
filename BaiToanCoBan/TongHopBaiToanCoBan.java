package BaiToanCoBan;

import java.util.Scanner;

public class TongHopBaiToanCoBan {

    // in ra hinh vuong mxn
    public static void InHcn(int a,int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //In ra hcn rong
    public static void InHcnRong(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(i==0||i==a-1||j==0||j==b-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // tong chan le
    public static void TongChanLe(int a){

        int sum =0;
        if(a%2==0){
            for (int i = 2; i < a; i+=2) {
                sum += i;
            }
            System.out.println(sum);
        }else {
            for (int i = 1; i < a ; i+=2) {
                sum +=i;
            }
            System.out.println(sum);
        }
    }
    // tong nghich dao
    public static void TongNghichDao(int n){
        double sum =0;
        for (int i = 1; i <=n; i++) {
            sum+=1.00/i;
        }
        System.out.println(sum);
    }
    // tim uoc chung
    public static void TimUoc(int n){
        for (int i = 1; i <=n/2; i++) {
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    // tinh tong cac chu so trong 1 so
    public static void TongCacChuSoTrongMotSo(int n){
        int sum= 0;
        while (n>0){
            sum +=n%10;
            n =n/10;
        }
        System.out.println(sum);
    }
    // Fibonacci
    public static int Fibo(int n) {
        int Fn;
        if (n <= 2) {
            return 1;
        } else {
            Fn = Fibo(n - 1) + Fibo(n - 2);
        }
        return Fn;
    }
    // phan tich so thanh thua so
    public static void PhanTichSoThanhSoNguyenTo(int n){
        int i=2;
        while (n>1){
            if (n%i==0){
                if (n==i) System.out.println(i);
                else System.out.print(i+"*");
                n/=i;
            }
            else i++;
        }
    }
    // liet ke n so nguyen to dau tien
    /// kiem tra xem so do co phai so nguyen to khong
    public static boolean KiemTraSoNguyenTo(int n){
        if (n<2) return false;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    /// ham liet ke n so nguyen to dau tien
    public static void LietKeNSoNguyenToDau(int a){
        int count=0;
        int i=2;
        while (count<a){
            if (KiemTraSoNguyenTo(i)){
                System.out.println(i+" ");
                count++;
            }
            i++;
        }
    }
    // liet ke so thuan nghich co 6 chu so
    // kiem tra thuan nghich
    public static boolean CophaiThuanNghich(int n){
        int tg = n;
        int temp = 0;
        while (n>0){
            temp = temp*10 +n%10;
            n/=10;
        }
        if (tg==temp){
            return true;
        }
        return false;
    }
    public static void SoThuanNgichTrongKhoang(int min, int max){
        for (int i=min;i<=max;i++){
            if(CophaiThuanNghich(i)){
                System.out.print(i+", ");
            }
        }
    }
    // tam giac pascal khong truy hoi
    public static long giaiThua(int n){
        long gt =1;
        if(n==0||n==1) return 1;
        else for (int i = 2; i <= n; i++) {
            gt *=i;
        }
        return gt;
    }
    public static void TamgiacPascal(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(giaiThua(i)/(giaiThua(j)*giaiThua(i-j)) + " ");
            }
            System.out.println();
        }
    }
    // tam giac pascal co truy hoi
    public static long pascal(int k, int n){
        if(k==0||k==n) return 1;
        else return pascal(k,n-1)+pascal(k-1,n-1);
    }
    public static void TamGiacPascalTruyHoi(int n){
        for (int i=0;i<=n;i++){
            for (int j = 0; j <=i ; j++) {
                System.out.print(pascal(j,i)+ " ");
            }
            System.out.println();
        }
    }
    // nhap mot day so a co n phan tu, dem so lan xuat hien cua tung phan tu trong mang
//     in ra phan tu xuat hien nhieu nhat
    public static void demSoPhanTuXuatHienTrongMnag(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i] == a[j]) b[i]++;
            }
        }
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] ==max){
                System.out.println(a[i] + " xuat hien:" + max+ " lan");
            }
        }
    }

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int m , n;
//        System.out.println(" nhap m,n");
//        m = sc.nextInt();
//        n = sc.nextInt();
//        InHcn(m,n);
//        InHcnRong(5,5);
//        TongChanLe(5);
//        TongNghichDao(20);
//        TimUoc(20);
//        TongCacChuSoTrongMotSo(11112);
//        System.out.println(Fibo(5));
//        PhanTichSoThanhSoNguyenTo(100);
//        LietKeNSoNguyenToDau(5);
//        SoThuanNgichTrongKhoang(100000,200000);
//        TamgiacPascal(3);
//        TamGiacPascalTruyHoi(10);
        int[] a={1,2,1,4,5,2,1};
//        demSoPhanTuXuatHienTrongMnag(a);

    }
}
