//  Demonstrate equals() vs ==.

public class Code13 {
    public static void main(String[] args) {
        String a = "Sunit";
        String b = new String("Sunit");

        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
}
