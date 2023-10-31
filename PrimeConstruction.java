import java.util.Arrays;
import java.util.Scanner;

public class PrimeConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbs = new int[n];
        for (int i = 0; i < n; i++) {
            numbs[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(numbs);

        int number = numbs[1];
        for (int i = 2; i < numbs.length; i++) {
            if (numbs[i] % number == 0) {
                number = number * (numbs[i] / number);
            } else {
                number = number * numbs[i];
            }
        }
        System.out.println(checkPrime(number + numbs[0]) ? number + numbs[0] : "None");
    }

    static boolean checkPrime(int num) {
        int temp = num - 1;
        while (temp > 1) {
            if (num % temp == 0) {
                return false;
            }
            temp--;
        }
        return true;
    }
}