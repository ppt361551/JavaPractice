package chapter1;

public class ForLoop {
    public static void main(String[] args) {
//        int counter = 0;
//
//        for (int i=0; i<100; i++){
//            counter++;
//            System.out.println(i);
//        }
//        System.out.println("counter= "+ counter);

        String[] friends = {"Bob", "KSP", "D2", "Ren", "CYG"};
        for (String f:friends) {
            System.out.println(f);
        }
    }
}
