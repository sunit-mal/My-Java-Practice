// A Single Double-Precision Number Denoting .

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HackerRankJavaCurrencyFormatter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        double payment = sc.nextDouble();
        sc.close();

        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = n1.format(payment);
        String india = n2.format(payment);
        String china = n3.format(payment);
        String france = n4.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
