package BaiToanCoBan;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class BaiToanVeMang {
    // in ra day so a co n phan tu dem so lan xuat hien. in ra
//    phan tu xh nhieu nhat
    public static int demSoLanXhNhieu(int[] a){
        int n=a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                if (a[j]==a[i]){
                    b[i]++;
                }
            }
        }
        int max =b[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(b[j]>max){
                    max=b[j];
                }
            }
        }
        return max;
    }
    //
    public static boolean kiemTraSoNguyenTo(int n){
        if(n<2) return false;
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void inRaMangNguyenTo(int[] a,int x ){
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            if(kiemTraSoNguyenTo(i)){
                temp=0;
                break;
            }
        }

    }
    public static void nhap(){
        int x,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang: ");
        n=sc.nextInt();
        int[] a =new int[n] ;
        for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"]: ");
            a[i] =sc.nextInt();
        }
        System.out.println("nhap x: ");
        x = sc.nextInt();
        inRaViTri(a,x);

    }

    private static void inRaViTri(int[] a, int x) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (kiemTraSoNguyenTo(i)) {
                temp = a[i];
                break;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (kiemTraSoNguyenTo(a[j]) && (Math.abs(a[j] - x) < Math.abs(temp - x))) {
                temp = a[j];
            }
        }
        System.out.println("mang a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (kiemTraSoNguyenTo(a[i]) && Math.abs(a[i] - x) == Math.abs(x - temp)) {
                System.out.println(" Vi tri: " + i);
            }
        }
    }
    public static void chenMangBvaoMangA(int[]a, int[] b, int index){
        int n=a.length+b.length;
        int[] c = new int[n];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        if (index==a.length){
            for (int i = 0; i < a.length; i++) {
                c[i]=a[i];
            }
            for (int i = 0; i < b.length; i++) {
                c[i+a.length] =b[i];
            }
        }
        else if (index<=0){
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i];
            }
            for (int i = 0; i < a.length; i++) {
                c[i+b.length] = a[i];
            }
        }
        else {
            for (int i = 0; i < b.length; i++) {
                c[index - 1 + i] = b[i];
            }
            for (int i = index - 1; i < a.length; i++) {
                c[b.length + i] = a[i];
            }
        }
    }

    public static void chenVaoMang(int[] a, int b){
        int[] c = new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            c[i] =a[i];
        }
        int index =c.length-1;
        for (int i = 0; i < c.length; i++) {
            if(c[i] >b){
                index=i;
                break;
            }
        }
        if(index!= c.length-1){
            for (int i = c.length-1; i >index ; i--) {
                c[i]=c[i-1];
            }
            c[index]=b;
        }else c[c.length-1]=b;

    }
    // xac dinh duong chay dai nhat
    public static void timDuongChayMax(int[] a){
        int n =a.length;
        int[] b = new int[n];
        int way=0;
        for (int i = 0; i < n-1; i++) {
            if(a[i+1]<a[i]){
            b[way]++;
            way++;
            }
            else {
            b[way]++;}
        }
        int ib=0;
        int max=0;
        for (int i = 0; i < n; i++) {
            if(b[i]>max){
                max=b[i];
                ib=i;
            }
        }
        System.out.println("chuoi:"+ max);
        for (int i = 0; i < n; i++) {
            if(b[i]==max){
                for (int j = 0; j < max ; j++) {
                    System.out.print(" "+ a[j]);
                }
            }
        }
    }
    // in ra 2 so co khoang cach la k
    public static void inRaHaiSoKhoangCachK(int[] a,int k){
        int n= a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(Math.abs(a[i]-a[j])==k){
                    System.out.println("2 so la :" + a[i]+" tai vi tri: "+i+ " va " + a[j] + "taivitri: "+j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,1,4};
        int[] b= {1,3,4,5,1,2,3,4,2,1};
//        System.out.println(demSoLanXhNhieu(a));
//        nhap();
//        chenMangBvaoMangA(a,b,2);
//        chenVaoMang(b,5);
//        timDuongChayMax(b);
//        inRaHaiSoKhoangCachK(a,2);
    }
}
