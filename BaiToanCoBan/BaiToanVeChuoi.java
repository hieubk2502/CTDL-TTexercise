package BaiToanCoBan;

import java.util.Locale;
import java.util.Scanner;

public class BaiToanVeChuoi {

    // kiem tra xau thuan nghich
    public static boolean thuanNghich(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) !=s.charAt(s.length()-1-i)) return false;

        }
        return true;
    }

    public static void ktraThuanNghich(){
        int count=0;
        for (int i = 10000; i < 99999; i++) {
            String s="";
            s+=i;
            if(thuanNghich(s)){
                System.out.print(i+" ");
                if (count++%10==0){
                    System.out.println(" ");
                }
            }
        }
    }
    // Xoa khoang trang o moi chuoi
    // b1: viet thuong moi tu
    public static void chuanHoaLai(String s){
        s=s.toLowerCase(Locale.ROOT);
        String s2="";
        String[] ss= s.split(" ");
        for (int i = 0; i < ss.length; i++) {
            String s1="";
            if (ss[i].length() !=0){
                s1+=Character.toUpperCase(ss[i].charAt(0));
                if(ss[i].length()>1) {
                    s1+=ss[i].substring(1);
                }
                s2+=s1;
                if (i<ss.length) s2+=" ";
            }
         }
        if(s2.charAt(s2.length()-1)==' '){
            s2+="\b";
        }
        System.out.println(s2);
    }
    // TIM TU dai nhat cua khau
    public static void timXauDaiNhat(String s){
        String[] ss = s.split(" ");
        int[] len=new int[ss.length];
        int max= 0;
        for (int i = 0; i < ss.length; i++) {
            len[i] =ss[i].length();
            if(ss[i].length()>max){
                max=ss[i].length();
            }
        }
        int count=0;
        for (int i = 0; i < ss.length; i++) {
            if (len[i]==max){
                System.out.println(ss[i]);
                System.out.println(" vi tri" +count);
            }
            count+=len[i] +1;
        }
        
    }
    /// so dep
    public static void soDep(int a, int b,int sd1, int sd2, int yc){
        int count=0;
        for (int i = a; i < b; i++) {
            if(LaSoDep(i,sd1,sd2,yc)){
                System.out.println(" " + i);
                count++;
            }
        }
    }

    private static boolean LaSoDep(int so,int sd1, int sd2,int yc) {
        int yck =0;
        while (so>0){
            int ak = so%10;
            so /=10;
            if (ak%sd1==0&&ak!=0||ak%sd2==0 &&ak!=0){
                yck++;
            }
        }
        if(yck>=yc){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
////        ktraThuanNghich();
//        String s =" hIEU TRAN MINH   REE  TAN";
////        chuanHoaLai(s);
//        timXauDaiNhat(s);

        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int sd1= sc.nextInt();
        int sd2 =sc.nextInt();
        int yc=sc.nextInt();
        soDep(a,b,sd1,sd2,yc);
    }


}
