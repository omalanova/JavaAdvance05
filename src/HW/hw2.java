package HW;

public class hw2 {
    public static void main (String args[]) {

        //task1
        int a = 5;
        int b = 6;
        if (a == b) {
            System.out.println(a + " == " + b);
        } else if (a > b){
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }

        //task2
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        //task3
        int d = 12;
        if (d > 10) {
            System.out.println("больше 10");
        }
        if (d < 100) {
            System.out.println("меньше 100");
        }
        if (d / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if ((d >= 5) && (d <= 40)) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        //task4
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }
    }
}
