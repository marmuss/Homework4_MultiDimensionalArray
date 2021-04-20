import java.util.Arrays;
import java.util.Scanner;
/**
 * Создает 3D массив со случайными целочисленными элементами
 * Добавляет к каждому элементу введенное пользователем значение
 * Выводит массив с измененными элементами
 */
public class Homework4_3dArray {
    public static void main(String[] args) {

        int[][][] array3D = new int[1][5][6];

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[0].length; j++) {
                for (int k = 0; k < array3D[0][0].length; k++) {
                    array3D[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        System.out.println("Имеется массив:");
        System.out.println(Arrays.deepToString(array3D));

        System.out.println("Введите число, на которое нужно увеличить каждый элемент массива");

        Scanner userInput = new Scanner(System.in);
        int  number = userInput.nextInt();

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[0].length; j++) {
                for (int k = 0; k < array3D[0][0].length; k++) {
                    array3D[i][j][k] += number;
                }
            }
        }

        System.out.println("Массив после увеличения элементов на " + number + ":");
        System.out.println(Arrays.deepToString(array3D));

    }
}
