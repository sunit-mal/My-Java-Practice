// GCD of set of integers in a two formats or find gcd recursively according to d condition..
// (gcd(a,b)=a if a==b else gcd(a,b)=gcd(a-b,b) if a>b else gcd(a,b)=gcd(a,b-a) if b>a)

public class GCDRecursive {
    public static void main(String[] args) {
        int[] numbers = { 12, 24, 36, 48 };
        int gcd = GCD(numbers);
        System.out.println("GCD: " + gcd);
    }

    static int GCD(int[] number) {
        int gcd = number[0];
        for (int i = 1; i < number.length; i++) {
            gcd = GCDRecursion(gcd, number[i]);
        }
        return gcd;
    }

    static int GCDRecursion(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return GCDRecursion(a - b, b);
        } else {
            return GCDRecursion(a, b - a);
        }
    }
}
