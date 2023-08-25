import java.util.Scanner;

public class StringTypeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        String [] str = sentence.split("\\s+");
        int Letter = 0;
        int Digit = 0;
        int nullvalue = 0;
        for(int i=0 ; i< str.length;i++){
            String test = StringTypeCount(str[i]);
            if (test =="Letter") {
                Letter++;
            } else if(test == "Digit"){
                Digit++;
            }  else{
                nullvalue++;
            }
        }
        System.out.println("Totel number of letter is "+Letter+"\nAnd totel number of digit : "+Digit+"\nNull value :"+nullvalue);

    }

    static String StringTypeCount(String a){
        char ch[] = a.toCharArray();
        if (Character.isLetter(ch[0])) {
            return "Letter";
        }
        else if (Character.isDigit(ch[0])) {
            return "Digit";
        } 
        else {
            return null;
        }
    }

}
