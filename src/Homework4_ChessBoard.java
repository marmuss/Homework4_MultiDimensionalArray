/**
 * Выводит массив 8x8 с раскрасской в виде шахматной доски
 */

public class Homework4_ChessBoard {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard[i].length; j++){
                if (i % 2  == 0) {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = "W";
                    } else {
                        chessBoard[i][j] = "B";
                    }
                } else {
                    if (j % 2 == 0) {
                        chessBoard[i][j] = "B";
                    } else {
                        chessBoard[i][j] = "W";
                    }
                }
                System.out.print(chessBoard[i][j] + "\t" );
            }
            System.out.println();
        }
    }
}
