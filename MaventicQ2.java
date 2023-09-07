import java.util.ArrayList;
import java.util.Scanner;

public class MaventicQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean check = checkPrime(num);
        if (check == true) {
            int i = checkContain(num);
            System.out.println(i);
        } else
            System.out.println(0);
        sc.close();
    }

    public static Boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int checkContain(int num) {
        ArrayList<Integer> n = new ArrayList<>();
        while (num != 0) {
            int temp = num % 10;
            n.add(temp);
            num = num / 10;
        }
        if (!n.contains(3)) {
            return 0;
        } else {
            return 1;
        }
    }
}
