/**
 * The program rearranges a input array so that,
 * every negative element goes to the left,
 * following is the zero element and then all the positive elements. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package DSA_topic3;

import java.util.Scanner;

public class Exercise01 {
  /**
   * Constructor for objects of class Exercise01
   */
  public Exercise01() {
  }

  public static void printArray(int [] a) {
    for (int i=0; i<a.length; i++) {
       System.out.print(a[i]+" ");
    }        
    System.out.println(" ");
  }
  
  // Insertion sort algorithm to sort the array in ascending order
  public static void insertionSort(int[] a) {
    // QUESTION 1
    // Write java code to implement this method 
    for (int i=1; i<a.length; i++) {
      int key = a[i];
      int j = i-1;
      while(j >=0 && a[j]>key) {
        a[j+1] = a[j];
        j=j-1;
      }
      a[j+1]=key;
    }
    
    // End of the method    
  }
  
  public static void main(String[] args) {
    int n;
    int[] a;  

    System.out.println("Please input the integer n:");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();        

    a = new int[n];        
    for (int i=0; i<n; i++) {
        System.out.println("Please input the integer a["+i+"]:");
        a[i]=scanner.nextInt();
    }        
    
    System.out.println("The input array is : ");
    printArray(a);
    
    insertionSort(a);

    System.out.println("The rearranged array is : ");
    printArray(a);        
  }
}