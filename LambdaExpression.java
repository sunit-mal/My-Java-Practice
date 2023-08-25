// import java.util.Scanner;

// Functional interface is a interface with single method
@FunctionalInterface
interface LambdaInterface {
    public void method1();
}

public class LambdaExpression {
    public static void main(String[] args) {
        // Lambda Expression use
        LambdaInterface obj = () -> {
            System.out.println("I am method 1");
        };

        obj.method1();
    }
}
