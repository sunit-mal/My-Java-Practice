import java.util.ArrayList;
import java.util.List;

public class zzz {
    public static void main(String[] args) {
        String str = "Note: Transfer to test account";
         System.out.println(str.length());
        // String str = "Beneficiary Bank: Sohar International Bank International";

        String text = str;
        if (text.length() >= 44) {
            while (!text.isEmpty()) {
                int index = text.contains(" ") ? text.lastIndexOf(" ", 44) : 0;
                String line = index != 0 ? text.substring(0, index) : text;
                text = index != 0 ? text.substring(index + 1) : ""; // If index is -1, set text to empty to exit the
                System.out.println(line);
                                                                    
            }
        }
    }
}
