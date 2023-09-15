import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * DigitIllution
 */
public class DigitIllution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int numArray[] = new int[t];
        for (int i = 0; i < t; i++) {
            numArray[i] = scanner.nextInt();
        }
        // System.out.println(Arrays.toString(numArray));
        sortingUsingTwoDigit(numArray);
        sortingUsingThreeDigit(numArray);
    }

    static void sortingUsingTwoDigit(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i+=2) {
            try{
                int temp = arr[i]*10+arr[i+1];
                list.add(temp);
            }
            catch (Exception e){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        StringBuilder st = new StringBuilder();
        for (Integer integer : list) {
            st.append(integer);
        }
       
        for (int i = 0; i < st.length(); i++) {
            newArr[i] = Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        System.out.println(Arrays.toString(newArr));
    }

    static void sortingUsingThreeDigit(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i+=3) {
            try{
                int temp = arr[i]*100+arr[i+1]*10+arr[i+2];
                list.add(temp);
            }
            catch (Exception e){
                try {
                    int temp = arr[i]*10+arr[i+1];
                    list.add(temp);
                } catch (Exception ex) {
                    list.add(arr[i]);
                }
            }
        }

        Collections.sort(list);
        StringBuilder st = new StringBuilder();
        for (Integer integer : list) {
            st.append(integer);
        }
       
        for (int i = 0; i < st.length(); i++) {
            newArr[i] = Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        System.out.println(Arrays.toString(newArr));
    }
}