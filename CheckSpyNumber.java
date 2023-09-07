import java.util.Scanner;

public class CheckSpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.print(checkSpy(number));
    }

    static Boolean checkSpy(int num) {
        int sum = 0;
        int product = 1;
        while (num != 0) {
            int temp = num % 10;
            sum += temp;
            product *= temp;
            num /= 10;
        }
        if (sum == product)
            return true;

        return false;
    }
}

/*
 * Note :
 *      A positive integer is called a spy number if the sum and product of its
 *      digits are equal. In other words, a number whose sum and product of all
 *      digits are equal is called a spy number.
 * 
 *  Example of Spy Number
 *      Let's take the number 1124 and check whether the number is a spy or not.
 *      First, we will split it into digits (1, 1, 2, 4). After that find the sum and
 *      product of all the digits.
 * 
 *      Sum=1+1+2+4=8
 * 
 *      Product=1*1*2*4=8
 * 
 *      We observe that the sum and product of the digits both are equal. Hence, 1124
 *      is a spy number.
 * 
 *      Similarly, we can check other numbers also. Some other spy numbers are 22,
 *      123, 132, etc.
 */