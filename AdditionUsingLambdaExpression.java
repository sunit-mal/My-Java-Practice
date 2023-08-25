import java.util.Scanner;

@FunctionalInterface
interface LambdaSum {
    public int add(int a, int b);
}

public class AdditionUsingLambdaExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        LambdaSum obj = (a, b) -> a + b;


        System.out.println(obj.add(x, y));
    }
}
