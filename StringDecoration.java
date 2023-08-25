import java.util.Scanner;

public class StringDecoration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        if (A.compareTo(B) <= 0) {
            System.out.println("No");
            A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length()).toLowerCase();
            B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length()).toLowerCase();
            System.out.println(A + " " + B);
        } 
        // else if (A.compareTo(B) == 0) {
        //     System.out.println("No");
        //     A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
        //     B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
        //     System.out.println(A + " " + B);
        // } 
        else {
            System.out.println("Yes");
            A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length()).toLowerCase();
            B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length()).toLowerCase();
            System.out.println(A + " " + B);
        }

    }
}