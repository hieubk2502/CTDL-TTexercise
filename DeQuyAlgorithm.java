public class DeQuyAlgorithm {
//  n giai thua
    public static int giaithua(int n){
//         bai toan co so
        if(n==0){
            return 1;
        }
//         cong thuc quy nhap
        return n*giaithua(n-1);
    }


//     tim so fibonaci thu n
    public static int Fibo(int n){
        if(n<=2){
            return 1;
        }
//cong thuc tong quat
         return Fibo(n-2)+Fibo(n-1);
    }
    static int[] F = new int[100];
    public static int Fibo2(int n){
        if(F[n] !=0){
            return F[n];
        }
        System.out.println("Can tinh["+ n+ "]");
        if(n<=2){
            F[1] =1;
            F[2] =1;
            return 1;
        }
        F[n] =Fibo2(n-1) +Fibo2(n-2);
        return F[n];
    }
// in ra so nguyen tu 1->n
    public static void printElement(int [] arr, int index){
        // bai toan co so
        if (index <0| index>=arr.length){
            return;
        }
        // cong thuc quy nap: in phan tu index, print index+!
        System.out.println(arr[index]);
        printElement(arr,index-1);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
//        System.out.println(giaithua(7));
//        System.out.println(Fibo(30));
//       printElement(a,5);
//        System.out.println(Fibo2(5));

        // bai toan co so
        int[] Fibo = new int[11];
        Fibo[1] =1;
        Fibo[2] =1;
        for (int i=3;i<=10;i++){
            // Cong thuc quy nap
            Fibo[i] = Fibo[i-1]+Fibo[i-2];
        }
        System.out.println(Fibo[10]);

    }
}
