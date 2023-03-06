public class DeQuyAlgorithm2 {
//  tim so max trong day
    private static int curMax =-1;
    public static void findMax1(int[] a, int i){
        if(i<a.length){
            if(a[i]>curMax){
                curMax=a[i];
            }
            findMax1(a,i+1);
        }
    }
    public static int findMax2(int[]a ,int i,int previousMax){
        if (i<a.length){
            int curMax = Math.max(a[i],previousMax);
            return findMax2(a,i+1,curMax);
        }
        return previousMax;

    }
    public static void main(String[] args){
        int[] a = {6,11,4,2,1,3,5};
        curMax =-1;
        findMax1(a,0);
        System.out.println(curMax);
        System.out.println(findMax2(a,0,-1));

    }
}
