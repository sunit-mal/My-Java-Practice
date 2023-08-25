import java.util.LinkedList;
import java.util.List;

public class NOC_MassagePassing_Problem {
    static int k = 0;
    static int currentPoint[] = new int[2];
    static int DestinationPoint[] = new int[2];
    static List<Integer> TR = new LinkedList<>();
    static List<Integer> obs = new LinkedList<>();
    static List<Integer> LDTR = new LinkedList<>();
    static List<Integer> sortMove = new LinkedList<>();
    static List<Integer> RDTR = new LinkedList<>();
    static List<Integer> DLTR = new LinkedList<>();

    public static void main(String[] args) {
        int sourcex = 1;
        int sourcey = 2;
        currentPoint[0] = sourcex;
        currentPoint[1] = sourcey;
        DestinationPoint[0] = 5;
        DestinationPoint[1] = 9;
        obs.add(32);
        obs.add(61);
        obs.add(55);
        obs.add(53);
        obs.add(65);
        obs.add(68);
        obs.add(67); // new addon
        int a = linearTraval();
        if (a == 1) {
            System.out.println("Not Possible");
        }
        a = horizontalTraval();
        if (a == 0) {
            System.out.println(TR);
        } else {
            System.out.println("Not Possible");
        }
        // System.out.println(obs);

        // System.out.println(LDTR);
        // System.out.println(DLTR);
    }

    static int linearTraval() {
        while (currentPoint[0] != DestinationPoint[0]) {
            boolean check = obs.contains(((currentPoint[0] + 1) * 10) + currentPoint[1]);
            if (check == false) {
                currentPoint = MoveRight(currentPoint[0], currentPoint[1]);
                TR.add((currentPoint[0] * 10) + currentPoint[1]);
            } else {

                currentPoint = MoveUp(currentPoint[0], currentPoint[1]);
                TR.add((currentPoint[0] * 10) + currentPoint[1]);
                k++;
            }
            if (k > 3) {
                return 1;
            }
        }
        return 0;
    }

    static int horizontalTraval() {
        int a = DownOne();
        TR.addAll(sortMove);
        sortMove.clear();

        if (a == 1) {
            return 1;
        }
        while (currentPoint[0] == DestinationPoint[0]) {
            if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                break;
            }
            a = DownOne();
            TR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
        }
        if (currentPoint[0] > DestinationPoint[0]) {
            int newLife = k;
            int point[] = currentPoint;
            int a1 = refarenceOne();
            currentPoint = point;
            k = newLife;
            int a2 = refarenceTwo();
            currentPoint = point;
            k = newLife;
            int a3 = refarenceThree();

            if ((a1 == 1) && (a2 == 1)) {
                if (a3 == 0) {
                    TR.addAll(DLTR);
                } else {
                    return 1;
                }
            } else if ((a1 == 1) && (a2 == 0)) {
                TR.addAll(RDTR);
            } else if ((a1 == 0) && (a2 == 1)) {
                TR.addAll(LDTR);
            } else {
                if (LDTR.size() > RDTR.size()) {
                    TR.addAll(RDTR);
                } else {
                    TR.addAll(LDTR);
                }
            }
        }
        // if (currentPoint[1] < DestinationPoint[1]) {
        // return 1;
        // }
        return 0;
    }

    static int refarenceOne() {
        while (currentPoint[0] != DestinationPoint[0]) {
            int a = DownAndLeft();
            LDTR.addAll(sortMove);
            sortMove.clear();
            while (currentPoint[0] == DestinationPoint[0]) {
                if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                    break;
                }
                a = DownOne();
                LDTR.addAll(sortMove);
                sortMove.clear();
                if (currentPoint[0] != DestinationPoint[0]) {
                    return 1;
                }
                if (a == 1) {
                    return 1;
                }
            }
            if (a == 1) {
                return 1;
            }
        }
        return 0;
    }

    static int refarenceTwo() {
        int a;
        while ((currentPoint[0] - DestinationPoint[0]) != (DestinationPoint[1] - currentPoint[1])) {
            a = DownOne();
            RDTR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
        }
        while ((currentPoint[0] != DestinationPoint[0]) && (currentPoint[1] != DestinationPoint[1])) {
            a = DownAndLeft();
            RDTR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
            while (currentPoint[0] == DestinationPoint[0]) {
                if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                    break;
                }
                a = DownOne();
                RDTR.addAll(sortMove);
                sortMove.clear();
                if (a == 1) {
                    return 1;
                }
            }
        }
        if (currentPoint[1] < DestinationPoint[1]) {
            return 1;
        }
        return 0;
    }
    static int refarenceThree(){
        int a;
        while (currentPoint[1] != DestinationPoint[1]) {
            a = DownOne();
            DLTR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
        }
        while (currentPoint[0] != DestinationPoint[0]) {
            a = DownAndLeft();
            DLTR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
            while (currentPoint[0] == DestinationPoint[0]) {
                if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                    break;
                }
                a = DownOne();
                DLTR.addAll(sortMove);
                sortMove.clear();
                if (a == 1) {
                    return 1;
                }
            }
        }
        if (currentPoint[1] < DestinationPoint[1]) {
            return 1;
        }
        return 0;
    }
    static int DownAndLeft() {
        if (currentPoint[0] > DestinationPoint[0]) {
            boolean check = obs.contains(((currentPoint[0] - 1) * 10) + currentPoint[1]);
            boolean check2 = obs.contains((currentPoint[0] * 10) + (currentPoint[1]) + 1);
            if (check == false) {
                currentPoint = MoveLeft(currentPoint[0], currentPoint[1]);
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
            } else if ((check == true) && (check2 == true)) {
                return 1;
            } else {
                currentPoint = MoveDown(currentPoint[0], currentPoint[1]);
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
            }
        }
        return 0;
    }

    static int DownOne() {

        int nextMove = currentPoint[1] + 1;
        while (currentPoint[1] != nextMove) {
            boolean check = obs.contains((currentPoint[0] * 10) + (currentPoint[1] + 1));
            if (check == true) {
                currentPoint = MoveRight(currentPoint[0], currentPoint[1]);
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
                k++;
            } else {
                currentPoint = MoveDown(currentPoint[0], currentPoint[1]);
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
            }
            if (k > 3) {
                return 1;
            }
        }
        return 0;
    }

    static int[] MoveUp(int x, int y) {
        int point[] = new int[2];
        point[0] = x;
        point[1] = y - 1;
        return point;
    }

    static int[] MoveDown(int x, int y) {
        int point[] = new int[2];
        point[0] = x;
        point[1] = y + 1;
        return point;
    }

    static int[] MoveLeft(int x, int y) {
        int point[] = new int[2];
        point[0] = x - 1;
        point[1] = y;
        return point;
    }

    static int[] MoveRight(int x, int y) {
        int point[] = new int[2];
        point[0] = x + 1;
        point[1] = y;
        return point;
    }
}
