public class SampleString {
    public static void main(String[] args) {
        String s = "Hello World";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)==true){
                System.out.println(c+ " ");
                System.out.println((int)c);
            }
        }
    }
}
