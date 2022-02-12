/*
In this program we check whether the number is armstrong or not
 */

import java.util.Scanner;

public class IsArmstrong_Number {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // int a = sc.nextInt();
        //boolean ans = isArmstrong(a);
        //System.out.println(ans);
        for (int i =100; i<=1000; i++){  // check all the armstrong number between range
            if(isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int a) {
        int original = a;
        int sum = 0;
        while (a > 0) {
            int remainder = a % 10;
            a = a/10;
            sum = sum + remainder*remainder*remainder;

        }
        return sum == original;
    }
}
