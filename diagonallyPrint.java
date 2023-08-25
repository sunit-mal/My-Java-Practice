// Print * diagonally 

public class diagonallyPrint {
    public static void main(String[] args) {
        int numRows = 5;
        printSlantingStar(numRows);
    }

    public static void printSlantingStar(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // For reverse 

        // for (int i = rows-1; i > 0; i--) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }
    }
}


/*
    WAP to print slanting * 

                *
            *
        *
    *
        *   
            *
                *

 */