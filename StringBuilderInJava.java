public class StringBuilderInJava {
    public static void main(String[] args) {
        String st = "Madam";
        st = st.toLowerCase();
        StringBuilder stb = new StringBuilder(st);          // you can pass string as constructor peramitor
        // stb.append(st);                                  //   You can append string in different line using obj reference
        String stnew = stb.reverse().toString();               //String builder return type is StringBuilder
        Boolean test = st.equals(stnew);
        System.out.print((test) ? "Palindrome" : "Not Palindrome");
    }
}
