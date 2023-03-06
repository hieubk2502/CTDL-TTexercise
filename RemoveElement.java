// Input {3,2,2,3} delete 2
//Output 2 and {3,3}

public class RemoveElement {
    public static int removeElenment(int[] a,int val){
        int n=a.length;
        for (int i = 0; i < n;) {
            if(a[i] ==val){
                for (int j =i;j<=n-2;j++){
                    a[j] =a[j+1];
                }
                n--;
            }
            else {
                i++;
            }
        }
        return n;
    }
// su dung 2 con tro
    public static int removeElement2(int[] a,int x){
        int k = 0;
        for (int i = 0; i < a.length; i++) {
           if (a[i] !=x){
               a[k] = a[i];
               k++;
           }
           else {
               // khong lam gi
           }
        }
        return k;
    }
    public static void main(String[] args){
        int[] a ={1,2,3,4};
        int n= removeElenment(a,2);
        System.out.println(n);
        System.out.println();
        for (int i = 0; i <= n-1; i++) {
            System.out.print(" " +a[i]);
        }
    }
}
