

public class CheckitTwoString {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s:word1) {
            sb1.append(s);
        }
        for (String a:word2) {
            sb2.append(a);
        }


        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        String[] s1 = {"tm","h"};
        String[] s2 = {"tm","h"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
}
