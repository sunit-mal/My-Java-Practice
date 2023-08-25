//  Prime number grouping within large number 
//  Input: num = 87911336191, n =2

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IBMPreviousYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int n = sc.nextInt();
        sc.close();
        String s = Long.toString(num);
        String arr[] = new String[((s.length() / n) + 1)];
        int a = 0;
        int b = n - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = s.substring(a, (b + 1));
            a += n;
            b += n;
        }
        arr[(arr.length - 1)] = s.substring(((n * (b / n))), (s.length()));

        List<Integer> li = new ArrayList<>();
        for (String string : arr) {
            li.add(Integer.valueOf(string));
        }

        for (Integer integer : li) {
            boolean test = prime(integer);
            if (test == true) {
                System.out.print(integer+" ");
            }
        }
    }

    static boolean prime(int n) {
        if (n == 1 || n ==0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
