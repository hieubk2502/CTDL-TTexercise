//Input {1,2,3,4,0,0,0} {3,0,6}
//Output {0,1,2,3,3,4,6}

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        for (int ai: nums2) {
            chenPhanTuVaoMang(ai,nums1,m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int ai, int[] nums1, int m) {
        boolean isChanged =false;
        for (int i = 0; i < m; i++) {
            if(nums1[i]>ai){
                isChanged=true;
                for (int j = m-1; j>=i ; j--) {
                    nums1[j+1]=nums1[j];
                }
                nums1[i] =ai;
                break;
            }
            if (isChanged==false){
                nums1[m]=ai;
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0,0};
        int[] nums2 = {4,0,6};
        merge(nums1,4,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(" " +nums1[i]);

        }
        System.out.println();
        System.out.println("Done");
    }
}
