//  Count no. of unique digit in given no.
//  Input: 1210     Output: 3

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AccentureCodingQs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();
        Set<Integer> st = new HashSet<>();
        while (num > 0) {
            int temp = (int)(num%10);
            st.add(temp);
            num = num /10;
        }
        System.out.println(st.size());
    }
}
