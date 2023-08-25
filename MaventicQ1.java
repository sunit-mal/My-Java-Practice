// Write a program, to input string1 and string2 and delete the common character from string2 which is present in 
// string1 and finally construct the string2 of deleted character above in another string2.

import java.util.ArrayList;

public class MaventicQ1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();

        Character latter;
        for (int i = 0; i < ((string1.length() < string2.length()) ? string2.length()
                : string1.length()); i++) {
            try {
                latter = string1.charAt(i);
                str1.add(latter.toString().toLowerCase());
            } catch (Exception e) {
            }
            try {
                latter = string2.charAt(i);
                str2.add(latter.toString().toLowerCase());
            } catch (Exception e) {
            }
        }

        for (String string : str1) {
            str2.remove(string);
        }
        
        String Final = "";
        for (String string : str2) {
            Final += string;
        }
        System.out.println(Final);
    }
}
