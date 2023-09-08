// Write a function in C, C++ or JAVA - To replace a string within another string specified number of times.
// The function takes 4 parameters
// String 
// String to Find
// String to replace
// Number of times the Replace has to be done.
// E.G for the given inputs - “ababaa”, “ba”, “cb”, 2
// Ababaa
// After 1st replacement, the string will be -  acbcba
// After 2nd replacement, the string will be -  acbccb
// Final Output - acbccb
// Points to Remember
// Do not use pre-built functions
// The function should be optimized. Loops should be optimized.

import java.util.*;

public class MaventiceQ3 {
    public static void main(String[] argos) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String find = sc.next();
        String replace = sc.next();
        int time = sc.nextInt();

        for (int i = 0; i < time; i++) {
            s = check(s, find, replace);
        }
        System.out.println(s);
    }

    static String check(String str, String find, String replace) {
        if (str.contains(find)) {
            str = str.replace(find, replace);
        }
        return str;
    }
}
