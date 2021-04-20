/**
 * Выводит произведение заданных матриц
 */
public class Homework4_MatrixMultiplication {

    public static void main(String[] args) {
       int[][] matrixA = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
       int[][] matrixB = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

       int[][] matrixC = new int[matrixA.length][matrixB[0].length];

       System.out.println("Произведение двух заданных матриц:");

       for (int i = 0; i < matrixA.length; i++) {
           for (int j = 0; j < matrixB[0].length; j++) {
               for (int k = 0; k < matrixA[0].length; k++) {
                   matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
               System.out.print(matrixC[i][j] + "\t");
            }
           System.out.println();
        }
    }
}
