import java.util.Scanner;

public class NearestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int num = nearestNumber(number);
        System.out.println(num);
    }

    static int nearestNumber(int num) {
        int k = 0;
        while (true) {
            if (checkPalindrome(num - k)) {
                return num - k;
            }
            if (checkPalindrome(num + k)) {
                return num + k;
            }
            k++;
        }
    }

    static boolean checkPalindrome(int num) {
        String st = String.valueOf(num);
        StringBuilder stb = new StringBuilder(st);
        stb.reverse();
        if (st.equals(stb.toString()))
            return true;
        return false;
    }
}