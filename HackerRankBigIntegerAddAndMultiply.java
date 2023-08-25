import java.math.BigInteger;
import java.util.Scanner;
  
public class HackerRankBigIntegerAddAndMultiply{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        sc.close();
        
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);
  
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}