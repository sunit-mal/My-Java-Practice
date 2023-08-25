import java.util.LinkedList;
import java.util.List;

public class NOC_MassagePassing_Problem_SRB_DLT {
    static int k = 0;
    static int currentPoint[] = new int[2];
    static int DestinationPoint[] = new int[2];
    static List<Integer> TR = new LinkedList<>();
    static List<Integer> obs = new LinkedList<>();
    static List<Integer> RUTR = new LinkedList<>();
    static List<Integer> sortMove = new LinkedList<>();
    static List<Integer> LUTR = new LinkedList<>();

    public static void main(String[] args) {
        int sourcex = 6;
        int sourcey = 6;
        currentPoint[0] = sourcex;
        currentPoint[1] = sourcey;
        DestinationPoint[0] = 2;
        DestinationPoint[1] = 2;
        obs.add(34);
        obs.add(46);
        obs.add(56);
        obs.add(45);
        obs.add(27);
        // obs.add(65);
        // obs.add(68);
        // obs.add(56); // new addon
        int a = linearTravel();
        if (a == 1) {
            System.out.println("Not Possible");
        }
        a = horizontalTravel();
        if (a == 0) {
            System.out.println(TR);
        } else {
            System.out.println("Not Possible");
        }
        // System.out.println(obs);

        // System.out.println(RUTR);
        // System.out.println(LUTR);
    }

    static int linearTravel() {
        while (currentPoint[0] != DestinationPoint[0]) {
            boolean check = obs.contains(((currentPoint[0] - 1) * 10) + currentPoint[1]);
            if (check == false) {
                currentPoint = MoveLeft(currentPoint[0], currentPoint[1]);
                TR.add((currentPoint[0] * 10) + currentPoint[1]);
            } else {

                currentPoint = MoveDown(currentPoint[0], currentPoint[1]);
                TR.add((currentPoint[0] * 10) + currentPoint[1]);
                k++;
            }
            if (k > 3) {
                return 1;
            }
        }
        return 0;
    }

    static int horizontalTravel() {
        int a = UpOne();
        TR.addAll(sortMove);
        sortMove.clear();

        if (a == 1) {
            return 1;
        }
        while (currentPoint[0] == DestinationPoint[0]) {
            if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                break;
            }
            a = UpOne();
            TR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
        }
        if (currentPoint[0] < DestinationPoint[0]) {
            int newLife = k;
            int point[] = currentPoint;
            int a1 = referenceOne();
            currentPoint = point;
            k = newLife;
            int a2 = referenceTwo();

            if ((a1 == 1) && (a2 == 1)) {
                return 1;
            } else if ((a1 == 1) && (a2 == 0)) {
                TR.addAll(LUTR);
            } else if ((a1 == 0) && (a2 == 1)) {
                TR.addAll(RUTR);
            } else {
                if (RUTR.size() > LUTR.size()) {
                    TR.addAll(LUTR);
                } else {
                    TR.addAll(RUTR);
                }
            }
        }
        // if (currentPoint[1] < DestinationPoint[1]) {
        // return 1;
        // }
        return 0;
    }

    static int referenceOne() {
        while (currentPoint[0] != DestinationPoint[0]) {
            int a = UpAndRight();
            RUTR.addAll(sortMove);
            sortMove.clear();
            while (currentPoint[0] == DestinationPoint[0]) {
                if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                    break;
                }
                a = UpOne();
                RUTR.addAll(sortMove);
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

    static int referenceTwo() {
        int a;
        while ((DestinationPoint[0] - currentPoint[0]) != (currentPoint[1] - DestinationPoint[1])) {
            a = UpOne();// returns k(>3) values
            LUTR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
        }
        while ((currentPoint[0] != DestinationPoint[0]) && (currentPoint[1] != DestinationPoint[1])) {
            a = UpAndRight(); // returns k(>3) values
            LUTR.addAll(sortMove);
            sortMove.clear();
            if (a == 1) {
                return 1;
            }
            while (currentPoint[0] == DestinationPoint[0]) {
                if ((currentPoint[0] == DestinationPoint[0]) && (currentPoint[1] == DestinationPoint[1])) {
                    break;// when reached destination
                }
                a = UpOne(); // only else part execute 1 time to reach dest
                LUTR.addAll(sortMove);
                sortMove.clear();
                if (a == 1) {
                    return 1;
                }
            }
        }
        if (currentPoint[1] > DestinationPoint[1]) {
            return 1;
        }
        return 0;
    }

    static int UpAndRight() {
        if (currentPoint[0] < DestinationPoint[0]) {
            boolean check = obs.contains(((currentPoint[0] + 1) * 10) + currentPoint[1]);
            boolean check2 = obs.contains((currentPoint[0] * 10) + (currentPoint[1]) - 1);
            if (check == false) {
                currentPoint = MoveRight(currentPoint[0], currentPoint[1]);
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
            } else if ((check == true) && (check2 == true)) {
                return 1;
            } else {
                currentPoint = MoveUp(currentPoint[0], currentPoint[1]);
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
            }
        }
        return 0;
    }

    static int UpOne() { // how many times iterates suppose I want to move down n hops

        int nextMove = currentPoint[1] - 1;
        while (currentPoint[1] != nextMove) { // max 1 times
            boolean check = obs.contains((currentPoint[0] * 10) + (currentPoint[1] - 1));
            if (check == true) {
                currentPoint = MoveLeft(currentPoint[0], currentPoint[1]); // if I want to move right n hops
                sortMove.add((currentPoint[0] * 10) + currentPoint[1]);
                k++;
            } else {
                currentPoint = MoveUp(currentPoint[0], currentPoint[1]); // if I want to move down n hops
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
