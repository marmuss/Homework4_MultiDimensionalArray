/**
 *  Создает массив со случайными элементами и считает сумму этих элементов
 */
public class Homework4_SumOfArrayElements {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = (int) (Math.random() * 10);
                System.out.printf("%5d", array[i][j]);

                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива равна " + sum);
    }
}
