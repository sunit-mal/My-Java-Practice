import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        List<Character> ret = new ArrayList<>();
        k = k % 26; // 1

        for (Character c : s.toCharArray()) {
            if (c.toString().matches("^[a-zA-Z]*$")) { // 2
                char temp = (char) ((int) (c) + k);

                if ((c >= 'A' && c <= 'Z' && temp > 'Z') || (temp > 'z'))
                    temp -= 26; // 3

                c = temp;
            }
            ret.add(c);
        }
        return ret.stream().map(n -> String.valueOf(n)).collect(joining());
    }

}

public class InterviewPreparationQ1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String s = sc.nextLine();
        sc.next();

        sc.close();

        String result = Result.caesarCipher(s, k);

        System.out.println(result);
    }
}
