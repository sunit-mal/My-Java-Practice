import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int c = (a > b) ? b : a;
        int k = 0;
        for (int i = 1; i < c; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                k++;
            }
        }
        System.out.println(k);
    }
}