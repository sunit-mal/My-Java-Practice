// Write a program to reverse each word in line(sentence)

public class reverseEachWordInSentence {

    public static void main(String[] args) {
        String sentence = "Hello, World! This is a sample sentence.";
        String reversedSentence = reverseWords(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseString(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static String reverseString(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }

}
