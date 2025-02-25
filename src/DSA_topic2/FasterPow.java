package DSA_topic2;

import java.util.Scanner;

public class FasterPow {
    public FasterPow() {
    }

    // Method RecPow() evaluate x^n using a recursive implementation
    public static double RecPow(double x, int n) {
        if(n ==0){
            return 1;
        }
        else if(n<0){
            return 1/ RecPow(x, -n);
        }
        return x * RecPow(x, n-1);




        // This statement must be deleted when you finish implementing this method
    }

    public static void main(String[]args) {
        int n;
        double x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of x:");
        x=scanner.nextDouble();

        System.out.println("Please enter the degree n:");
        n=scanner.nextInt();

        System.out.println("The value of (" + x + ")^" + n + " is: " + RecPow(x,n));
    }
}
