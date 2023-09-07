//  Construct string from subset of char array.

public class ArrayToString {
    public static void main(String[] args) {
        char ch[] = {'S','U','N','I','T'};
        String st = String.copyValueOf(ch,0,3);
        System.out.println(st);
    }
}
