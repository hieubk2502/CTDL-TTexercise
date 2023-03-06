public class KiemTraSoDep {


    public static boolean kiemTraSoDep(int a){
        int[] b= new int[10];
        while (a>0){
            int i=a%10;
            if(i%5==0||i%7==0){
                b[i]++;
            }
            a /=10;
        }
        if (b[5] +b[7]>=2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i < 100; i++) {
            if(kiemTraSoDep(i)){
                count++;
            }
        }
        System.out.println("tongSoDepTheoSanPhan: "+count);
    }
}
