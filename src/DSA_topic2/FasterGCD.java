package DSA_topic2;

import java.util.Scanner;

public class FasterGCD {
    public FasterGCD() {
    }

    // This recursive method implement the Euclidean algorithm
    // to find gcd of two integers
    public static int recGCD(int m, int n) {
        if(n == 0){
            return m;
        }
        return recGCD(n, m % n );
        // This statement must be deleted when you finish implementing this method
    }

    // This method implement the Euclidean algorithm
    // to find gcd of two integers
    public static int loopGCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }

        return m; // This statement must be deleted when you finish implementing this method
    }

    public static void main(String[] args) {
        int m,n;

        System.out.println("Please enter the integer m:");
        Scanner scanner = new Scanner(System.in);
        m=scanner.nextInt();

        System.out.println("Please enter the integer n (n<=m):");
        n=scanner.nextInt();

        System.out.println("The gcd("+ m + "," + n + ") is: " + recGCD(m,n));
        System.out.println("The gcd("+ m + "," + n + ") using loop is: " + loopGCD(m,n));
    }
}
