/*
        Input: 9 [1,8,6,2,5,4,8,3,7]
        Output: 49

        Input: 9 [1,8,6,2,5,4,7,8,3]
        Output:48

 */

import java.util.Scanner;

public class TrapWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queries = sc.nextInt();
        int list[] = new int[queries];

        for (int i = 0; i < queries; i++) {
            list[i] = sc.nextInt();
        }
        sc.close();

        int result = Volume(list);
        System.out.println(result);
    }

    static int Volume(int[] array) {

        int Volume = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i] < array[j] ? array[i] : array[j];
                int length = i < j ? j - i : i - j;
                int newVolume = temp * (length);
                if (Volume < newVolume) {
                    Volume = newVolume;
                }
            }
        }
        return Volume;
    }
}
