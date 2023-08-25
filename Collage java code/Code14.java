//  Demonstrates getChars( ):

public class Code14 {
    public static void main(String[] args) {
        String a = "Sunit";
        char[] charecter = new char[10]; 
         
        a.getChars(0, 3 ,charecter, 0);
        System.out.println(charecter);
    }
}
