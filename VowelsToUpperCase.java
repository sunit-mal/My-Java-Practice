// Write a program to convert all vowels to capital letter in a sentence

public class VowelsToUpperCase {
    public static void main(String[] args) {
        String sentence = "Hello, World! This is a sample sentence.";

        StringBuilder newSentence = new StringBuilder();
        // sentence = sentence.toLowerCase();
        String[] letters = sentence.split("");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals("a")) {
                letters[i] = letters[i].toUpperCase();
            }
            if (letters[i].equals("e")) {
                letters[i] = letters[i].toUpperCase();
            }
            if (letters[i].equals("i")) {
                letters[i] = letters[i].toUpperCase();
            }
            if (letters[i].equals("o")) {
                letters[i] = letters[i].toUpperCase();
            }
            if (letters[i].equals("u")) {
                letters[i] = letters[i].toUpperCase();
            }
            
            newSentence.append(letters[i]);
            
        }

        System.out.println(newSentence);
    }
}
