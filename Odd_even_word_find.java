/* 
    Write a program to accept a line from user and find
        a.)no of odd words present
        b.)no of even words present
        c.)no of word representing the set(is,of,on and the)
*/

public class Odd_even_word_find {
    public static void main(String[] args) {
        String sentence = "Hello World! It is a simple sentence.";
        String[] Words = sentence.split("\\P{Alpha}+");

        int OddWord = 0, EvenWord = 0, Preposition = 0;

        for (String word : Words) {
            if (word.length() % 2 == 0) {
                EvenWord++;
            } else {
                OddWord++;
            }

            if (word.toLowerCase().equals("is") || word.toLowerCase().equals("of") || word.toLowerCase().equals("on")||word.toLowerCase().equals("the")) {
                Preposition++;
            }
        }

        System.out.println("Sentence is: \""+sentence+"\"");
        System.out.println("No of odd words present "+OddWord);
        System.out.println("No of even words present "+EvenWord);
        System.out.println("No of word representing the set(is,of,on and the) "+Preposition);
    }
}
