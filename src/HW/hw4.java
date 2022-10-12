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
    }
}
