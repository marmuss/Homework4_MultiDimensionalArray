import java.util.Arrays;
/**
 * Создает 2D массив со случайными целочисленными элементами,
 * Сортирует строки массива по возрастанию,
 * Выводит отсортированный массив
 */
public class Homework4_AscendingSorting {
    public static void main(String[] args) {
        int[][] array = new int[3][4];

        System.out.println("Сгенерированный массив:\n");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print( array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nОтсортированный по возрастанию массив:\n");

        for (int i = 0; i< array.length; i++){
            Arrays.sort(array[i]);
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
