// BBsort, ISsort, Selection

import java.util.Arrays;

public class Test {

    public static void printArray(int i,int [] a){
        System.out.print(i+ ": ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] +" ");
        }
        System.out.println();
    }
    //BBS
    public static void BBS(int[] a){
        int n= a.length;
        for (int i = 0; i <n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1]){
                    isSorted=false;
                    int t= a[j];
                    a[j] =a[j+1];
                    a[j+1] = t;
                }
            }

            printArray(i,a);
            if(isSorted =true){
                break;
            }
        }
    }
    // ISsort

    public static void ISS(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j=i-1;
            while (j>=0&&a[j]>ai){
                a[j+1]=a[j];
                j--;
            }
            // j=-1
            a[j+1] =ai;
            printArray(i,a);
        }
    }
    // SLS
    public static void SLS(int[] a){
        int n=a.length;
        for (int i = 0; i < n-1; i++) {
            int index = a[i];
            for (int j = i+1; j <n-1 ; j++) {
                if (a[index]>a[j]){
                    index =j;
                }
            }
            if (index!=i){
                int t =a[index];
                a[index] = a[i];
                a[i] =t;
            }
            printArray(i,a);
        }
    }
    // merge sort
    // tron vao
    public static int[] merge(int[] a1, int[] a2){
        int n = a1.length+ a2.length;
        int[] results = new int[n];
        int i=0,i1=0,i2=0;
        while (i<n){
            if(i1<a1.length &&i2<a2.length){
                if(a1[i1]<a2[i2]){
                    results[i] = a1[i1];
                    i++;i1++;
                }else {
                    results[i] = a2[i2];
                    i++;i2++;
                }
            }else {
                if (i1<a1.length){
                    results[i] = a1[i1];
                    i++;i1++;
                }
                else {
                    results[i] = a2[i2];
                    i++;i2++;
                }
            }
        }
        return results;
    }
    // chia ra
    public static int[] mergeSort(int[] a,int L, int R){
        if(L>R) {
            return new int[0];
        }
        if(L==R){
            int[] singleElement = {a[L]};
            return singleElement;
        }
        int k =(L+R)/2;
        int[] a1 = mergeSort(a,L,k);
        int[] a2 = mergeSort(a,k+1,R);
        int[] result = merge(a1,a2);
        System.out.println("ketqua merge"+ Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        int[] a={2,1,5,4,3,5,4,7};
//        BBS(a);
//        ISS(a);
//        ISS(a);
        int[] b = {1,5,8,6,3,2};
        System.out.println(Arrays.toString(mergeSort(b,0,b.length-1)));

    }
}
