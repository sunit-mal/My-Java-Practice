import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueStringPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] ch = st.toCharArray();
        
        Set<Character> set = new LinkedHashSet<>();
        for (Character c : ch) {
            set.add(c);
        }
        for (Character character : set) {
            System.out.print(character);
        }
        sc.close();
    }
}