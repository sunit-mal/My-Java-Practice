import java.util.*;

public class CodeVitaQB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();  

        char[][] seating = new char[N][];
        for (int i = 0; i < N; i++) {
            seating[i] = scanner.nextLine().toCharArray();
        }

        String[] groupsInput = scanner.nextLine().split(",");
        int[] groups = new int[groupsInput.length];
        for (int i = 0; i < groupsInput.length; i++) {
            groups[i] = Integer.parseInt(groupsInput[i]);
        }

        String[] seatCostInput = scanner.nextLine().split(" ");
        int[] seatCost = new int[seatCostInput.length];
        for (int i = 0; i < seatCostInput.length; i++) {
            if (!seatCostInput[i].equals("?")) {
                seatCost[i] = Integer.parseInt(seatCostInput[i]);
            }
        }

        int totalCollection = scanner.nextInt();
        scanner.close();

        int vacantSeats = processBookings(seating, groups, seatCost, totalCollection);

        for (char[] row : seating) {
            System.out.println(new String(row));
        }

        System.out.print(vacantSeats);
        for (int i = 0; i < groups.length; i++) {
            System.out.print(" " + groups[i]);
        }
        System.out.println();


        System.out.println(computeMissingRowCost(totalCollection, seatCost, seating));
    }

    static int processBookings(char[][] seating, int[] groups, int[] seatCost, int totalCollection) {
        int vacantSeats = 0;
        int priorityGroup = getPriorityGroup(groups.length);
        int row = 0;

        for (int i = 0; i < groups.length; i++) {
            if (row >= seating.length) {
                break;  
            }

            while (groups[i] > 0 && row < seating.length) {
                int seatsAvailable = countVacantSeats(seating[row]);

                if (seatsAvailable >= groups[i]) {
                    bookSeats(seating[row], groups[i], priorityGroup);
                    groups[i] = 0;
                } else {
                    bookSeats(seating[row], seatsAvailable, priorityGroup);
                    groups[i] -= seatsAvailable;
                    row++;
                }
            }
        }


        for (char[] rowArray : seating) {
            vacantSeats += countVacantSeats(rowArray);
        }

        return vacantSeats;
    }

    static void bookSeats(char[] row, int seatsToBook, int priorityGroup) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == '_') {
                row[i] = (char) ('0' + priorityGroup);
                seatsToBook--;
                if (seatsToBook == 0) {
                    break;
                }
            }
        }
    }

    static int countVacantSeats(char[] row) {
        int count = 0;
        for (char seat : row) {
            if (seat == '_') {
                count++;
            }
        }
        return count;
    }

    static int getPriorityGroup(int numGroups) {
        int middle = numGroups / 2;
        if (numGroups % 2 == 0) {
            return middle + 1;
        } else {
            return middle + 2;
        }
    }

    static int computeMissingRowCost(int totalCollection, int[] seatCost, char[][] seating) {
        int totalSeats = 0;
        int totalCost = 0;
    
        for (int i = 0; i < seatCost.length; i++) {
            for (char[] row : seating) {
                if (row[0] == '_' || row[0] == ('0' + i + 1)) {
                    totalSeats++;
                    totalCost += seatCost[i];
                }
            }
        }
    
        if (totalSeats == 0) {
            return 0; // No seats available, cost is zero.
        }
    
        return (totalCollection - totalCost) / totalSeats;
    }
    
}

