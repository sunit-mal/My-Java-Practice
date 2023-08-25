import java.util.ArrayList;
import java.util.List;

public class combinationGenerator {
    public static void main(String[] args) {
        int number = 123;
        List<String> combinations = generateCombinations(number);

        // Print the combinations

        System.out.println(combinations);

    }

    public static List<String> generateCombinations(int number) {
        String numString = String.valueOf(number);
        List<String> combinations = new ArrayList<>();

        // Recursive function to generate combinations
        generateCombinationsHelper(numString, "", combinations);

        return combinations;
    }

    private static void generateCombinationsHelper(String remainingDigits, String currentCombination,
            List<String> combinations) {
        if (remainingDigits.length() == 0) {
            // All digits used, add the current combination to the list
            combinations.add(currentCombination);
            return;
        }

        // Take one digit at a time and generate combinations
        for (int i = 0; i < remainingDigits.length(); i++) {
            char digit = remainingDigits.charAt(i);

            // Remove the chosen digit from the remaining digits
            String newRemainingDigits = remainingDigits.substring(0, i) + remainingDigits.substring(i + 1);

            // Generate combinations recursively
            generateCombinationsHelper(newRemainingDigits, currentCombination + digit, combinations);
        }
    }
}
