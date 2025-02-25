package DSA_Excercise;
import java.util.Scanner;
public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        System.out.println("Enter " + N + " integers:");

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < N; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum integer is: " + max);

        scanner.close();
    }
}
