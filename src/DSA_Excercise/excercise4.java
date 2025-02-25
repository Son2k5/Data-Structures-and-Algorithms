package DSA_Excercise;
import java.util.Scanner;
public class excercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[N];

        System.out.println("Enter " + N + " names:");
        for (int i = 0; i < N; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();


        int position = -1;
        for (int i = 0; i < N; i++) {
            if (names[i].equals(searchName)) {
                position = i + 1;
                break;
            }
        }


        if (position != -1) {
            System.out.println("The name is at position: " + position);
        } else {
            System.out.println("The name is not in the list: -1");
        }

        scanner.close();
    }
}
