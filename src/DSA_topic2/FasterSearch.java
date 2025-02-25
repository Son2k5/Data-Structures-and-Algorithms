package DSA_topic2;

import java.util.Scanner;

public class FasterSearch {
    public static void print_array(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();


    }

    // Method Search() searches for an integer m in an ordered array a
// This method is implemented using a while loop
    public static int Search(int[] a, int m, int left, int right) {
        // Input: array a
        // seach for integer m in a from left index to right index
        // thuat toan chia de tri , chia danh sach thanh hai nua roi o sanh cac phan tu CAN TIM VOI PHAN TU GIUA DANH SACH

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == m) {
                return mid;
            } else if (a[mid] < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Method RecSearch() searches for an integer m in an ordered array a
// This method used a recursive implementation
    public static int RecSearch(int[] a, int m, int left, int right) {
        // Input: array a
        //        seach for integer m in a from left index to right index

        //Base case
        if (left > right) {
            return -1;
        }
        if (a[left] == m) {
            return left;
        }
        return Search(a, m, left + 1, right);
    }

    public static void main(String[] args) {
        int n, m;
        int[] a;

        System.out.println("Please enter the integer n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter the integer a[" + i + "]:");
            a[i] = scanner.nextInt();
        }

        System.out.println("The array is:");
        print_array(a);

        System.out.println("Please enter the integer m for searching:");
        m = scanner.nextInt();

        System.out.println("The search result is: " + Search(a, m, 0, a.length - 1));
        System.out.println("The search result is (using recursive version): " + RecSearch(a, m, 0, a.length - 1));
    }
}