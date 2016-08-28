package nyc.c4q.akashaarcher;

/**
 * Created by akashaarcher on 8/28/16.
 */


/*
Write a program that creates a single string that represents an 8×8 grid, using newline characters to separate lines.
At each position of the grid there is either a space or a “#” character. The characters should form a chess board.
Printing the string should show something like this:

  # # # #
# # # #
 # # # #
# # # #
 # # # #
# # # #
 # # # #
# # # #

 */

public class ProblemFive {
    public static void main(String[] args) {
        System.out.println(chessboard(8));
    }



    public static String chessboard(int size) {
        String board = "";
        for (int j = 0; j < size; j++) {
            if (j % 2 == 0) {
                board += " ";
            }
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    board += "#";
                } else {
                    board += " ";
                }
            }
            board += "\n";
        }
        return board;
    }
}
