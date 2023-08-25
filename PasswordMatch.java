// Validate a password having total characters bet 8-10,
// having no special character
// At least one uppercase alphabet or one integer.

import java.util.regex.*;
import java.util.Scanner;

public class PasswordMatch {
    public static void main(String[] args) {
        String StringType = "^(?=.*[A-Z0-9])[a-zA-Z0-9]{8,10}$";
        Scanner sc = new Scanner(System.in);

        String Password = sc.nextLine();
        sc.close();

        System.out.println(Pattern.matches(StringType,Password));
    
    }
}
