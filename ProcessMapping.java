// Process arrange using cost:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProcessMapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> process = new ArrayList<>();

        // Number of cost
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Present Node , Cost, Next Node");
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                Integer values = sc.nextInt();
                temp.add(values);
            }
            process.add(temp);
        }
        sc.close();
        ArrayList<ArrayList<Integer>> sortedProcesses = sortProcess(process);

        // System.out.println(sortProcess(sortedProcesses));
        mapping(sortProcess(sortedProcesses));
    }

    // Sort the processes based on the cost
    static ArrayList<ArrayList<Integer>> sortProcess(ArrayList<ArrayList<Integer>> processes) {
        ArrayList<ArrayList<Integer>> sortProcesses = new ArrayList<>();

        // Create a custom comparator to sort by the cost (second element)
        Comparator<ArrayList<Integer>> costComparator = new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1)); // Compare by cost (the second element)
            }
        };

        // Sort the processes based on the cost
        Collections.sort(processes, costComparator);

        // Copy the sorted processes to the result ArrayList
        sortProcesses.addAll(processes);
        Collections.reverse(sortProcesses);

        return sortProcesses;
    }

    static void mapping(ArrayList<ArrayList<Integer>> processes) {
        int grideX = (processes.size() / 2) >= 4 ? (processes.size() / 2) : 4;
        int grideY = grideX - 1;

        int[][] gride = new int[grideX][grideY];
        for (int[] rows : gride) {
            Arrays.fill(rows, -1);
        }

        int x = 1, y = 1;
        int tempX = 0, tempY = 0;
        for (ArrayList<Integer> element : processes) {
            if (exists(gride, element.get(0))) {
                if (!exists(gride, element.get(2))) {
                    int[] indexes = indexesFind(gride, element.get(0));
                    tempX = indexes[0];
                    tempY = indexes[1];
                    int i = 1;
                    while (i < grideX) {
                        if (tempY + i < grideY) {
                            if (gride[tempX][tempY + i] == -1) {
                                gride[tempX][tempY + i] = element.get(2);
                                break;
                            }
                        }
                        if (tempX + i < grideX) {
                            if (gride[tempX + i][tempY] == -1) {
                                gride[tempX + i][tempY] = element.get(2);
                                break;
                            }
                        }
                        if (tempX - i > 0) {
                            if (gride[tempX - i][tempY] == -1) {
                                gride[tempX - i][tempY] = element.get(2);
                                break;
                            }
                        }
                        if (tempY - i > 0) {
                            if (gride[tempX][tempY - i] == -1) {
                                gride[tempX][tempY - i] = element.get(2);
                                break;
                            }
                        }

                        i++;
                    }
                }

            } else if (exists(gride, element.get(2))) {
                if (!exists(gride, element.get(0))) {
                    int[] indexes = indexesFind(gride, element.get(2));
                    tempX = indexes[0];
                    tempY = indexes[1];
                    int i = 1;
                    while (i < grideX) {
                        if (tempY + i < grideY) {
                            if (gride[tempX][tempY + i] == -1) {
                                gride[tempX][tempY + i] = element.get(0);
                                break;
                            }
                        }
                        if (tempX + i < grideX) {
                            if (gride[tempX + i][tempY] == -1) {
                                gride[tempX + i][tempY] = element.get(0);
                                break;
                            }
                        }
                        if (tempX - i > 0) {
                            if (gride[tempX - i][tempY] == -1) {
                                gride[tempX - i][tempY] = element.get(0);
                                break;
                            }
                        }
                        if (tempY - i > 0) {
                            if (gride[tempX][tempY - i] == -1) {
                                gride[tempX][tempY - i] = element.get(0);
                                break;
                            }
                        }

                        i++;
                    }
                }
            } else {
                if (gride[x][y] == -1) {
                    gride[x][y] = element.get(0);
                    tempX = x;
                    tempY = y;
                } else {
                    int[] indexes = foundPlace(gride);
                    tempX = indexes[0];
                    tempY = indexes[1];
                    gride[tempX][tempY] = element.get(0);
                }

                int i = 1;
                while (i < grideX) {
                    if (tempY + i < grideY) {
                        if (gride[tempX][tempY + i] == -1) {
                            gride[tempX][tempY + i] = element.get(2);
                            break;
                        }
                    }
                    if (tempX + i < grideX) {
                        if (gride[tempX + i][tempY] == -1) {
                            gride[tempX + i][tempY] = element.get(2);
                            break;
                        }
                    }
                    if (tempX - i > 0) {
                        if (gride[tempX - i][tempY] == -1) {
                            gride[tempX - i][tempY] = element.get(2);
                            break;
                        }
                    }
                    if (tempY - i > 0) {
                        if (gride[tempX][tempY - i] == -1) {
                            gride[tempX][tempY - i] = element.get(2);
                            break;
                        }
                    }

                    i++;
                }
            }
        }

        System.out.println(processes);
        for (int[] is : gride) {
            System.out.println(Arrays.toString(is));
        }
    }

    // Index Finding in 2D Array
    static int[] indexesFind(int[][] gride, int value) {
        int[] indexes = new int[2];
        for (int i = 0; i < gride.length; i++) {
            for (int j = 0; j < gride[i].length; j++) {
                if (gride[i][j] == value) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    static int[] foundPlace(int[][] gride) {
        int[] indexes = new int[2];
        for (int i = 1; i < gride.length; i++) {
            for (int j = 1; j < gride[i].length; j++) {
                if (gride[i][j] == -1) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    // Check the value is exists in 2D Array
    static boolean exists(int[][] gride, int value) {
        for (int[] is : gride) {
            for (int i : is) {
                if (i == value) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
 * Present Node, Cost, Next Node
 * 0 400 1
 * 0 200 2
 * 0 1400 5
 * 2 1000 3
 * 2 1000 5
 * 2 1200 4
 * 3 200 4
 * 4 2200 5
 */