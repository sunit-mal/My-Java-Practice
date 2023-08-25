import java.util.Scanner;

public class FCFS {
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

        System.out.println("\nUseing FCFS : ");
        int exicution_time = 0;
        for (int i = 0; i < num_process; i++) {
            exicution_time += bustime[i];
            System.out.print(process[i] + "(" + (exicution_time) + ")  ");
        }

    }

}
