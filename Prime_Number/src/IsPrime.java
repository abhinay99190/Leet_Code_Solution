/*
To check whether the number is prime or not
 */

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int a = 2;
        while (a*a <= n) {
            if(n % 2 == 0) {
                return false;
            }
            a++;
        }
        return a * a >= n;
    }
}
