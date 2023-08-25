import java.util.Scanner;

public class HackerRankJavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        if (a.length() != b.length()) {
            return false;
        }
        int count1[] = new int[256];
        int count2[] = new int[256];

        for (int i = 0; i < a.length(); ++i) {
            count1[a.charAt(i)]++;
            count2[b.charAt(i)]++;
        }
        
        if (java.util.Arrays.equals(count1, count2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
