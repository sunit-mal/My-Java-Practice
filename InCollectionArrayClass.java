import java.util.Arrays;

public class InCollectionArrayClass {
    public static void main(String[] args) {
        int arra[] ={23,11,4,12,33,6,54};
        Arrays.sort(arra);                      // use to sort the array in ascending order
        for (int element : arra) {
            System.out.print(element+", ");
        }
        System.out.println("\n");
        int index = Arrays.binarySearch(arra, 33);  //  Perform Binary Search
        System.out.println("Index Of 33 is "+index);
        
        Arrays.fill(arra, 0);               //  Fill full array with 0
        for (int element : arra) {
            System.out.print(element+", ");
        }
    }
}
