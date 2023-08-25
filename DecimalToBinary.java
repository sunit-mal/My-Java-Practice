// Program for Decimal to Binary converter

public class DecimalToBinary {

    public static void main(String[] args) {
        int num = 10;
        LogicalWay(num);
        AdvanceWay(num);
    }

    public static void LogicalWay(int n) {
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n /= 2;
        }
        System.out.println(binary);
    }

    public static void AdvanceWay(int num) {
        System.out.println(Integer.toBinaryString(num));
    }
}
