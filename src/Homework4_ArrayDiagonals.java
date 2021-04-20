import java.util.Arrays;
/**
 * Создает массив со случайными элементами
 * Выводит диагонали этого массива в виде одномерных массивов
 */
public class Homework4_ArrayDiagonals {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        int[] diagonal1 = new int[array.length];
        int[] diagonal2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j){
                    diagonal1[i] = array[i][j];
                }
                if ((array.length - 1) - j == i){
                    diagonal2[i] = array[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Диагонали массива: " + Arrays.toString(diagonal1) + " и " + Arrays.toString(diagonal2));

    }
}
