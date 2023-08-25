import java.util.Scanner;
// import java.io.*;

public class String_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = new String("Hey");
        System.out.println("Enter Any thing : ");
        String a = sc.nextLine();
        sc.close();
        System.out.println(a.toUpperCase());
        //System.out.println(a.substring(5, 15));
        System.out.println(c.matches("Hey"));
        //System.out.println(a.offsetByCodePoints(index, codePointOffset);
        System.out.println(c.codePointAt(4));
    }
    // public static void main(String[] args)throws IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("Enter Any thing : ");
    // String a = br.readLine();
    // br.close();
    // System.out.println(a.toUpperCase());
    // }
}
