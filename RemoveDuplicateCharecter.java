import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharecter {
    public static String removeDuplicates(String s) {
        // Create a LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        
        // Iterate through the string and add characters to the set
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        
        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        System.out.println(removeDuplicates(input1));
    }
}
