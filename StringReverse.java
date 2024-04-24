public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        ReverseProcess.reverseExecute(str);
    }
}

class ReverseProcess {

    // Constructor
    private ReverseProcess(String str) {
        reverse(str);
    }

    public void reverse(String str) {
        // String reverse2;
        String reverse = "";
        for (String string : str.split("")) {
            reverse = string + reverse;
        }
        System.out.println(reverse);
    }

    static void reverseExecute(String str) {
        new ReverseProcess(str);
    }
}