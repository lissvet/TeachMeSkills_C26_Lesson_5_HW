import java.util.Arrays;
/**Create a program to color a chessboard using a loop.
 * Using loops, set the array elements to B(Black) or W(White).*/
public class Task_1 {

    public static void main(String[] args) {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i%2 == 0 && j%2 == 0){
                    board[i][j] = "W";
                } else if(i%2 == 0){
                    board[i][j] = "B";
                }
                if(i%2 != 0 && j%2 == 0){
                    board[i][j] = "B";
                } else if(i%2 != 0){
                    board[i][j] = "W";
                }
            }
        }
        System.out.println(Arrays.deepToString(board[0]));
        System.out.println(Arrays.deepToString(board[1]));
        System.out.println(Arrays.deepToString(board[2]));
        System.out.println(Arrays.deepToString(board[3]));
        System.out.println(Arrays.deepToString(board[4]));
        System.out.println(Arrays.deepToString(board[5]));
        System.out.println(Arrays.deepToString(board[6]));
        System.out.println(Arrays.deepToString(board[7]));
    }

}
