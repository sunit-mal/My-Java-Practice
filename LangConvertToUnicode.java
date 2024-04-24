public class LangConvertToUnicode {
    public static void main(String[] args) {
        String text = "هناك خطأ ما.";
        String unicodeString = convertToUnicode(text);
        System.out.println(unicodeString);
    }
    
    public static String convertToUnicode(String text) {
        StringBuilder unicodeString = new StringBuilder();
        for (char c : text.toCharArray()) {
            unicodeString.append("\\u").append(String.format("%04x", (int) c));
        }
        return unicodeString.toString();
    }
}
