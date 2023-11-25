import java.util.Scanner;

public class CodeVitaQE {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] customers = new int[n][2];
        int[][] bags = new int[m][2];

        
        for (int i = 0; i < n; i++) {
            customers[i][0] = sc.nextInt(); 
            customers[i][1] = sc.nextInt(); 
        }

        
        for (int i = 0; i < m; i++) {
            bags[i][0] = sc.nextInt(); 
            bags[i][1] = sc.nextInt(); 
        }

        sc.close();

        int bagsSold = 0;

        for (int i = 0; i < n; i++) {
            int customerQuantity = customers[i][0];
            int customerCost = customers[i][1];

            for (int j = 0; j < m; j++) {
                int bagQuantity = bags[j][0];
                int bagCost = bags[j][1];

               
                if (bagCost <= customerCost && bagQuantity >= customerQuantity) {
                   
                    bags[j][0] = -1;
                    bags[j][1] = -1;

                    bagsSold++;
                    break; 
                }
            }
        }

    
        System.out.println(bagsSold);
    }
}