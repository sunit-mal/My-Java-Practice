import java.util.Scanner;

public class HackerRankJavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> a = new java.util.ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            a.add(s.substring(i, i + k));
        }
        java.util.Collections.sort(a);
        smallest = a.get(0);
        largest = a.get(a.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*
 * lexicographically-ordered
 * We then return the first (lexicographically smallest) substring and the last (lexicographically largest) 
 * substring as two newline-separated values (i.e., ava\nwel).
 * The stub code in the editor then prints ava as our first line of output and wel as our second line of 
 * output.
 * 
 * Input:   welcometojava
 *          3   
 */