package chapter1;

public class Test {
    public static void main(String[] args) {
        String s = "153";
        boolean num = true;
         int a = Character.getNumericValue(s.charAt(0));
         int b = Character.getNumericValue(s.charAt(1));
         int c = Character.getNumericValue(s.charAt(2));
         int x = Integer.parseInt(s);
         if (x == a*a*a + b*b*b + c*c*c){
             System.out.println(x + "是水仙花數");
         } else {
             System.out.println(x + "不是水仙花數");
         }
    }
}
