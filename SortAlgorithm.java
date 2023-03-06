import java.util.Arrays;

public class SortAlgorithm {
    public static void printArray(int io, int[] a){
        System.out.print(io+": ");
        int n = a.length;
        for (int i=0;i<n;i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
//    chay tu dau toi cuoi mang
//    phan tu dung trc lon hon phan tu phia sau thi doi cho
//    sau moi vong thi phan tu lon nhat se doi cho
    public static void TestBubbleSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean isSorted = true;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    isSorted =false;
                    int temp = a[j];
                        a[j]= a[j+1];
                        a[j+1] = temp;
                }
            }
            printArray(i,a);
            if(isSorted =true){
                break;
            }
        }
    }

    //chay tu dau toi cioi mang
//    tai vong lap i, coi day [0,i-1] da dc sap xep, chen phan tu a[i] vao day vi tri thich hop
//    sau vong lap thi i thi day [0 i-1] da dc sap xep
    public static void TestInsertionSort(int[] a){
        int n= a.length;
        for(int i=1;i<n;i++){
            int ai =a[i];
            int j=i-1;
            while (j>=0&&a[j]>ai){
                a[j+1]=a[j];
                j--;
            }
            // no tri toi vi tri -1 phai cong them 1
            a[j+1] = ai;
            printArray(i,a);
        }
    }

//    chay tu dau toi cuoi mang
//    tai vong lap thu i , tim phan tu nho nhat [i+1,n-1] neu nho hon a[i] thi doi cho
//    sau vong lap thu i thi [0,i] duoc sap xep
    public static void TestSelectionSort(int[] a){
        int n= a.length;

        for (int i=0; i<n;i++){
            int minindex =i;
            for (int j=i+1;j<n;j++){
                // tim minh [i,n]
                if (a[j]<a[minindex]){
                    minindex=j;
                }
            }
            if (minindex!=i){
                int t= a[i];
                a[i]= a[minindex];
                a[minindex]=t;
            }
            printArray(i,a);
        }
    }
// MergeSort
    public static int[] merge(int[] a1,int[] a2){
        int n =a1.length +a2.length;
        int[] results = new int[n];
        int i=0,i1=0,i2=0;
        while (i<n){
            if(i1<a1.length&&i2<a2.length){//a1,a2 khac rong
                if(a1[i1]<a2[i2]){
                    results[i]=a1[i1];
                    i++;i1++;

                }else {// a2 nho hon hoac bang
                    results[i] =a2[i2];
                    i++;i2++;
                }
            }
            else { // a1 rong hoac a2 rong
                if(i1<a1.length){
                    results[i] = a1[i1];
                    i++;i1++;
                }
                else {
                    results[i] =a2[i2];
                    i++;i2++;
                }
            }
        }
        return results;
    }

    public static int[] mergeSort(int[] a, int L, int R ){
        // truong hop dac biet
        if(L>R){ return new int[0];}
        if(L==R) {
            int[] singleElement ={a[L]};
            return singleElement;
        }
        // truong hop tong quan

        // chia ra
        System.out.println("chia+ " +L +"-"+R);
        int k=(L+R)/2;
        int[] a1 =mergeSort(a,L,k);
        int[] a2 =mergeSort(a,k+1,R);
        // tron vao a2 a1 la cac mang da dc sap sep
        int[] result=merge(a1,a2);
        System.out.println("Ketqua Merge: "+ Arrays.toString(result));
        return result;
    }
    public int[] sortArray(int[] nums){
        return mergeSort(nums,0,nums.length-1);
    }

    // quick sort
    public static void quickSort(int[] a, int L, int R){
        if(L>=R){
            return;
        }
        // chon khoa
        int key = (a[(L+R)/2]);
        // phan bo lai mang theo khoa
        int k = partition(a,L,R,key);
        // b3 chia doi mang lap lai
        quickSort(a,L,k-1);
        quickSort(a,k,R);
    }
    // return pivot value
    public static int  partition(int[ ] a,int L, int R, int key){
        int iL = L;
        int iR = R;
        while (iL<=iR){
            // VOI Il, di tim phan tu >= key de doi cho
            while (a[iL]<key) iL++;
            // Voi IR, di tim phan tu <=key de doi cho
            while (a[iR]>key) iR--;
            if(iL<=iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] =temp;
                iL++;iR--;
            }
        }
        return iL;
    }


    public static void main(String[] args) {
        int[] a3 = {9, 7, 5, 8, 6, 4, 3, 1, 2};
        int[] b = {1, 2, 3, 4, 5, 6, 8, 7};
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 10};
        int[] a = {1, 5, 3, 2, 8, 7, 6, 4};
//        TestInsertionSort(a);
//        TestBubbleSort(a);
//        TestSelectionSort(a);
//            SortAlgorithm s = new SortAlgorithm();
////        System.out.println(Arrays.toString(merge(a1,a2)));
//        System.out.println(Arrays.toString(s.mergeSort(a3,0,a3.length-1)));
         mergeSort(a3,0,a3.length-1);
//        quickSort(a, 0, a.length - 1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
    }
}
