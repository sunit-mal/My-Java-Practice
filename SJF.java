import java.util.Scanner;

public class SJF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of process : ");
        int num_process = sc.nextInt();
        String[] process = new String[num_process];
        int[] bustime = new int[num_process];
        System.out.println("Process\tBustime");
        for (int i = 0; i < num_process; i++) {
            System.out.print(">> ");
            process[i] = sc.next();
            bustime[i] = sc.nextInt();
        }
        sc.close();

        // Short Process according bustime
        for (int i = 0; i < process.length; i++) {
            for (int j = i; j < process.length; j++) {
                if (bustime[i] > bustime[j]) {
                    int temp = bustime[i];
                    bustime[i] = bustime[j];
                    bustime[j] = temp;
                    String s = process[i];
                    process[i] = process[j];
                    process[j] = s;
                }
            }
        }
        System.out.println("\nUsing SJF");
        int execution_time2 = 0;
        for (int i = 0; i < num_process; i++) {
            execution_time2 += bustime[i];
            System.out.print(process[i] + "(" + (execution_time2) + ")  ");
        }
    }
}
