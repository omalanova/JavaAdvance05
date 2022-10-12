package HW;

public class hw4 {
    public static void main (String args[]) {
        /*
        Задача №1

0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0

         */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        Задача №2

0  1  2  3  4  5  6  7  8  9
   0  1  2  3  4  5  6  7  8
      0  1  2  3  4  5  6  7
         0  1  2  3  4  5  6
            0  1  2  3  4  5
               0  1  2  3  4
                  0  1  2  3
                     0  1  2
                        0  1
                           0

         */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print((j - i) + " ");
                }
            }
            System.out.println();
        }

        /*
        Задача №3

9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
  8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
    7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
      6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
          4 3 2 1 0 1 2 3 4
            3 2 1 0 1 2 3
              2 1 0 1 2
                1 0 1
                  0

         */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print((9 - j) + " ");
                }
            }
            for (int j = 1; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        Задача №4

Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел

         */

        sum2(2,5);
        sub2(2, 5);
        mul2(2, 5);
        div2(2, 5);

    }
    public static void sum2(int a, int b) {
        System.out.println(a + b);
    }
    public static void sub2(int a, int b) {
        System.out.println(a - b);
    }
    public static void mul2(int a, int b) {
        System.out.println(a * b);
    }
    public static void div2(int a, int b) {
        if (b == 0) {
            System.out.println("No");
        } else {
            System.out.println(a / b);
        }
    }
}
