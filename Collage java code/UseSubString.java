//  Illustrate a  program that uses substring( ) to replace all instances of one substring with another      
//  within a string.

public class UseSubString {

    public static void main(String[] args) {
        String S = "Laptop";
        String S1 = S.substring(0, 3);
        String S2 = "Desk";
        S = S.replaceAll(S1,S2);
        System.out.println(S);
    }
}
