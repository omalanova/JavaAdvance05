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
    }
}
