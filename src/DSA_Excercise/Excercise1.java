package DSA_Excercise;
import java.util.Scanner;
public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        String new_name = name.replace(" ", "");
        int character_Count = new_name.length();

        System.out.println("The name has " + character_Count + " characters.");

        scanner.close();
    }
}
