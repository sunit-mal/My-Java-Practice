import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankIPAdressCheck {
    public static void main(String[] args) {
        String zeroto255 = "\\b([0-2]|[0-5]|[0-5])";
        String regexpattern = zeroto255+"\\."+zeroto255+"\\."+zeroto255+"\\."+zeroto255;
        Pattern pattern = Pattern.compile(regexpattern);
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            Matcher matcher = pattern.matcher(IP);
            boolean matchFound = matcher.matches();
            System.out.println(matchFound);
        }
        in.close();

    }
}
