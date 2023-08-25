import java.util.ArrayList;
import java.util.List;

public class SubSequencesInJava {
    public static void main(String[] args) {
        String input = "abc";
        List<String> subsequences = generateSubsequences(input);

        // Print the subsequences
        System.out.println(subsequences);

    }

    public static List<String> generateSubsequences(String input) {
        List<String> subsequences = new ArrayList<>();

        // Generate subsequences recursively
        generateSubsequencesHelper(input, "", 0, subsequences);

        return subsequences;
    }

    private static void generateSubsequencesHelper(String input, String currentSubsequence, int index,
            List<String> subsequences) {
        if (index == input.length()) {
            // All characters processed, add the current subsequence to the list
            subsequences.add(currentSubsequence);
            return;
        }

        // Exclude the current character and generate subsequences
        generateSubsequencesHelper(input, currentSubsequence, index + 1, subsequences);

        // Include the current character and generate subsequences
        generateSubsequencesHelper(input, currentSubsequence + input.charAt(index), index + 1, subsequences);
    }
}
