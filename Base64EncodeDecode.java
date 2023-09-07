import java.util.Base64;

public class Base64EncodeDecode {
    public static void main(String[] args) {
        String input = "Sunit";
        
        byte[] encodedValue = Base64.getEncoder().encode(input.getBytes());
        String encodeString = new String(encodedValue);
        byte[] decodedValue = Base64.getDecoder().decode(encodeString);
        String decodeString = new String(decodedValue);

        System.out.println(encodeString + "\t" + decodeString);
    }
}
