/**
 * The program implements an O(n) algorithm to rearrange a input array so that,
 * every negative element goes to the left,
 * following is the zero element and then all the positive elements. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package DSA_topic3;

import java.util.Scanner;

public class Exercise03 {
  /**
   * Constructor for objects of class Exercise03
   */
  public Exercise03() {
  }

  public static void printArray(int[] a) {
    for (int i=0; i<a.length; i++) 
       System.out.print(a[i]+" ");        
    System.out.println();
  }

  /**
   * This method implement an O(n) algorithm to rearrange array a so that
   * the left part is the elements that is smaller than m,
   * the right part is the elements that is bigger than m.
   */
  public static void rearrangeArray(int[] a, int m) {
      int left = 0, right = a.length - 1, i = 0;

      while (i <= right) {
          if (a[i] < m) {  // Nếu là số âm
              swap(a, i, left);
              left++;
              i++;
          } else if (a[i] > m) {  // Nếu là số dương
              swap(a, i, right);
              right--;
          } else {  // Nếu là số 0
              i++;
          }
      }
  }

    // Hàm hoán đổi 2 phần tử trong mảng
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
  
  public static void main(String[]args)
  {
      int n;
      int[] a;  

      System.out.println("Please input the integer n:");
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();        

      a = new int[n];        
      for (int i=0; i<n; i++) {
          System.out.println("Please input the integer a["+i+"]:");
          a[i] = scanner.nextInt();
      }        
      
      System.out.println("The input array is : ");
      printArray(a);
      rearrangeArray(a,0);
      System.out.println("The rearranged array is : ");
      printArray(a);        
  }
}