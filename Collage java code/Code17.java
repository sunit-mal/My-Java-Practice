//  Illustrate sample program that sorts an array of strings. The program uses compareTo( ) method.

public class Code17 {
    public static void main(String[] args) {
        String ch[] = { "A", "C", "E", "B" };
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i; j < ch.length; j++) {
                int result = ch[i].compareTo(ch[j]);
                if (result >= 0) {
                    String temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        for (String string : ch) {
            System.out.print(string+" ");
        }
    }
}
