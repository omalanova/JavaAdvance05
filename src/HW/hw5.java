package HW;

public class hw5 {
    public static String countingSheep(int num) {
            //Add your code here
            String result = "";
            for (int i = 1; i <= num; i++) {
                result += i + " sheep...";
            } return result;
        }
    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 + flower2) % 2 != 0) {
            return true;
        }
        return false;
    }

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        /*
        If you can't sleep, just count sheep!!
Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers.
https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

         */
        System.out.println(countingSheep(5));

        /*
        Code as fast as you can! You need to double the integer and return it.
        https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
         */
        System.out.println(doubleInteger(5));

        /*
        Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
        If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

        Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
         */

        System.out.println(isLove(2, 4));

        /*
        We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?
Examples (input --> output):

123  --> "123"
999  --> "999"
-100 --> "-100"

https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
         */
        System.out.println(numberToString(123));

        /*
        Given an array of integers your solution should find the smallest integer.

For example:

    Given [34, 15, 88, 2] your solution will return 2
    Given [34, -345, -1, 100] your solution will return -345

You can assume, for the purpose of this kata, that the supplied array will not be empty.
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

         */
        System.out.println(findSmallestInt(new int[]{34, 15, 88, 2}));
    }
}
