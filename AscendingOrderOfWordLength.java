//  WAP to create a pattern from input string (ascending order of word length, repeated word must be removed-case insensitive).

import java.util.LinkedHashSet;
import java.util.Set;

public class AscendingOrderOfWordLength {
    public static void main(String[] args) {
        String sentence = "Hello, World! This is a sample sentence.";
        String[] words = sentence.split("\\P{Alpha}+");
        sortAccordingLength(words);

        Set<String> Sorted_Word = new LinkedHashSet<>();
        for (String string : words) {
            Sorted_Word.add(string);
        }

        System.out.println(Sorted_Word);
    }

    public static String[] sortAccordingLength(String[] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].length() > list[j].length()) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
