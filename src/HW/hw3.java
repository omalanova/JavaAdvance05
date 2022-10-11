package HW;

public class hw3 {
    public static void main(String[] args) {
        /* Задача №1

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
*/
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println("s = " + s);

        /*
        Задача №2

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.

         */
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

        /*
        Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.

         */
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

        /*
        Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.

         */
        int s1 = 0;
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array2.length; i++) {
            s1 += array2[i];
        }
        System.out.println("average = " + s1 / array2.length);

        /*
        Задача №5

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.

         */
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int s2 = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                s2 += array3[i][j];
            }
        }
        System.out.println("s2 = " + s2);

        /*
        Задача №6

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.

         */
        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max1 = array4[0][0];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 1; j < array4[i].length; j++) {
                if (array4[i][j] > max1) {
                    max1 = array4[i][j];
                }
            }
        }
        System.out.println("max1 = " + max1);

        /*
        Задача №7

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.

         */
        int count = 0;
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                count++;
            }
        }
        System.out.println("count = " + count);

        /*
        Extra Задача №1
Написать программу что выводит на печать круг картинкой. Любыми символами.
Круг может быть овальный, пустой внутри или наполненный символами.
При написании программы можно использовать любые доступные знания.
         */
        System.out.println("     00     ");
        System.out.println("    0  0    ");
        System.out.println("   0    0   ");
        System.out.println("  0      0  ");
        System.out.println(" 0        0 ");
        System.out.println("0          0");
        System.out.println(" 0        0 ");
        System.out.println("  0      0  ");
        System.out.println("   0    0   ");
        System.out.println("    0  0    ");
        System.out.println("     00     ");

    }
}
