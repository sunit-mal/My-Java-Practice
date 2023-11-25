// String From Rank

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeVitaQC {

    public static ArrayList<String> generateCombinations(int length) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        ArrayList<String> combinations = new ArrayList<>();
        generateCombinationsHelper(alphabet, length, "", combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(char[] alphabet, int length, String current,
            ArrayList<String> combinations) {
        if (length == 0) {
            if (checking(current) != true) {
                combinations.add(current);
            }
            return;
        }

        for (char c : alphabet) {
            generateCombinationsHelper(alphabet, length - 1, current + c, combinations);
        }
    }

    public static boolean checking(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        int length = sc.nextInt();
        sc.close();
        ArrayList<String> combinations = generateCombinations(length);
        Collections.sort(combinations);
        System.out.println(combinations.get(position-1));
    }
}

