//  String Permutation 
//  Input : Mississippi      Output: 34650
//  Input : ABC             Output: 6

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AccentureCodingQs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        sc.close();
        st = st.toUpperCase();

        List<Character> ch = new ArrayList<>();
        Set<Character> stch = new HashSet<>();
        for (int i = 0; i < st.length(); i++) {
            ch.add(st.charAt(i));
            stch.add(st.charAt(i));
        }
        System.out.println(ch);
        System.out.println(stch);
        int totel = 1;
        for (Character element : stch) {
            int freq = java.util.Collections.frequency(ch, element);
            if (freq != 1) {
                totel *= factorial(freq);
            }
        }

        System.out.println(factorial(st.length()) / totel);
    }

    static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
