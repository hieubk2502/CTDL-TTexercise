// input {1,22,333,4444,5555} tim so co so chu so chan va chia het cho 2
// output 2 so va {22,4444}

public class FindNumbersWith {
//
    public static int findNumbers(int[] nums){
        int bienDem = 0;
        for (int a: nums) {
            // kiem tra so chu so cua a
            // neu so/10 !=0 thi tang bien den len 1
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo%2==0){
                bienDem++;
            }
        }
        return bienDem;
    }

    private static int tinhSoChuSo(int a) {
        int bienDem =0;
        int kq =a;
        while (kq!=0){
            kq /=10;
            a=kq;
            bienDem++;
        }
        return bienDem;
    }


    public static void main(String[] args) {
        int[] nums = {1,22,333,4444,55555};
        System.out.println(findNumbers(nums));

    }
}
