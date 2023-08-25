// import java.util.Scanner;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class regex {

//     public static void main(String[] args) {
//         Pattern pattern = Pattern.compile(
//                 "\\b([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]|[0][0-9]|[0][0][0-9]|[0][1-9][0-9])\\b[.]{1}\\b([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]|[0][0][0-9]|[0][1-9][0-9]|[0][0-9])\\b[.]{1}\\b([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]|[0][0][0-9]|[0][1-9][0-9]|[0][0-9])\\b[.]{1}\\b([0-9]|[1-9][0-9]|[1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5]|[0][0][0-9]|[0][1-9][0-9]|[0][0-9])\\b",
//                 Pattern.CASE_INSENSITIVE);
//         Scanner in = new Scanner(System.in);
//         while (in.hasNext()) {
//             Matcher matcher = pattern.matcher("00.12.123.123123.123");
//             String IP = in.next();
//             boolean matchFound = matcher.find();
//             System.out.println(IP.matches(new MyRegex().pattern));
//         }
//     }
// }

