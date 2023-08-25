import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
    static int ans = 0;
    public static int findTotalWeight(List<Integer> cans) {
        while(cans.size() > 0){
           int min = Collections.min(cans);
           ans += min;
           int index = cans.indexOf(min);
           if (index == (cans.size()-1)) {
               cans.remove(index);
               cans.remove(index-1);
           }
           else if (index == 0) {
               cans.remove(index+1);
               cans.remove(index);
           }
           else{
               cans.remove(index+1);
               cans.remove(index);
               cans.remove(index-1);
           }
            if (cans.size()==1) {
                ans += cans.get(0);
               cans.remove(0);
           }
        }
    
        return ans;
    }

}
public class DTCC_Code2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int cansCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> cans = IntStream.range(0, cansCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.findTotalWeight(cans);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}