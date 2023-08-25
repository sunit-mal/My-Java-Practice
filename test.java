// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

// class Result {

//     /*
//      * Complete the 'typeCounter' function below.
//      *
//      * The function accepts STRING sentence as parameter.
//      */

//     public static void typeCounter(String sentence) {
//        String [] SplitString = sentence.split("\\s+");
//        char[] ch = sentence.toCharArray();
//        int num = 0;
//        int str = 0;
//        int dou = 0;
//        for(int i=0;i<= SplitString.length;i++){
//            if(String.isDigit(SplitString[i])){
//                num++;
//            }
//         //    else if (isDouble(SplitString[i])){
//         //        dou++;
//         //    }
//         //    else if (isString(SplitString[i])){
//         //        str++;
//            }
//            else{
//                int a = 0;
//            }
           
//        System.out.println("string "+str);
//        System.out.println("integer "+num);
//        System.out.println("double "+dou);
//         }
//     }

// public class test {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         String sentence = bufferedReader.readLine();

//         Result.typeCounter(sentence);

//         bufferedReader.close();
//     }
// }
