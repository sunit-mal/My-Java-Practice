import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // int sum = matrix.get(i).get(j) + matrix.get(i).get(2 * n - 1 - j)
                //         + matrix.get(2 * n - 1 - i).get(j) + matrix.get(2 * n - 1 - i).get(2 * n - 1 - j);
                maxSum += Math.max(Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - 1 - j)),
                        Math.max(matrix.get(2 * n - 1 - i).get(j), matrix.get(2 * n - 1 - i).get(2 * n - 1 - j)));
            }
        }
        return maxSum;

    }

}

public class HackerRankMatrixFlip {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                        .map(Integer::parseInt)
                                        .collect(toList()));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
