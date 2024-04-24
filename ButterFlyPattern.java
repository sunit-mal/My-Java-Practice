public class butterflyPattern {
    public static void main(String[] args) {
        int n = 9;
        forward(n);
        backward(n);
    }

    static void forward(int n) {
        int central = (2 * n) - 1;
        for (int i = 0; i < n; i++) {
            int edgeIndex = i;
            int midIndex = central - (2 * edgeIndex);
            for (int j = 0; j <= edgeIndex; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < midIndex - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= edgeIndex; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void backward(int n) {
        int central = (2 * n) - 1;
        for (int i = n - 1; i >= 0; i--) {
            int edgeIndex = i;
            int midIndex = central - (2 * edgeIndex);
            for (int j = 0; j < edgeIndex; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= midIndex; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < edgeIndex; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
