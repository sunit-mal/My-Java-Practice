// abcabcddd;


public class zzz {

    public static void main(String[] args) {
        int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
        // int[][] board = { { 1, 1 }, { 1, 0}};
        Solution obj = new Solution();
        obj.gameOfLife(board);
    }

}

class Solution {
    public void gameOfLife(int[][] board) {
        int[][] output = new int[board.length][board[0].length];
        // int[][] output = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int temp = neighborsCheck(board, i, j);
                if (board[i][j] == 1) {
                    if (temp == 2 || temp == 3)
                        output[i][j] = 1;
                    else
                        output[i][j] = 0;

                } else {
                    if (temp == 3)
                        output[i][j] = 1;
                    else
                        output[i][j] = 0;

                }
            }
        }

        System.out.println(java.util.Arrays.deepToString(output));
    }

    public int neighborsCheck(int[][] array, int i, int j) {
        int count = 0;
        int row = array.length;
        int col = array[0].length;

        for (int k = i - 1; k <= i + 1; k++) {
            for (int s = j - 1; s <= j + 1; s++) {
                if (k >= 0 && k < row && s >= 0 && s < col && !(k == i && s == j)) {
                    count += array[k][s];
                }
            }
        }

        return count;
    }
}