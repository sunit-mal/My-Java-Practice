/*
 In Chemistry lab Sum of experiment
    input: 5    3   3
    output: 24

    Explain:    N1  T = 5 = 5
                N2  T = 5+3 = 8
                N3  T = 5+3+3 = 11
            OUTPUT WILL BE 5+8+11
*/

public class WiproQ18 {
    public static void main(String[] args) {
        int[] input = { 5, 1, 1 };
        int[] T = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            T[i] = 0;
            for (int j = 0; j <= i; j++) {
                T[i] += input[j];
            }
        }

        int output = 0;
        for (int i = 0; i < T.length; i++) {
            output += T[i];
        }

        System.out.print(output);
    }
}
