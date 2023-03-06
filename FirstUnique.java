// input : leecode
//output : 0. in ra vi tri xuat hien 1 lan ddau tien

public class FirstUnique {
    public static int firstUniqChar(String s){

        char[] arr =s.toCharArray();
        int[] counts  = new int[123];
        for (int i = 0; i <arr.length ; i++) {
            char c=arr[i];
            int index = (int) c;
            counts[index]++;
        }
        for (int j = 0; j < arr.length; j++) {
            char c = arr[j];
            int index =(int)c ;
            if (counts[index]==1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="leecode";
        System.out.println(firstUniqChar(s));

    }
}
