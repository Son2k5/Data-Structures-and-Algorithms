/**
 * The program maintains a list of N strings, all of them have the same length M characters.
 * A method is implemented to sort this list of strings in lexicographical order. 
 * @author (nxthang) 
 * @version (1.0)
 */
package DSA_topic3;

import java.util.Scanner;
import java.lang.String;

public class Exercise05 {
  /**
   * Constructor for objects of class Exercise02
   */
  public Exercise05() {
  }

  public static void printList(String [] a) {
    for (int i=0; i<a.length; i++) {
       System.out.print(a[i]+" | ");
    }        
    System.out.println(" ");
  }
  /**
   * This method compares two string s1 and s2 lexicographically (alphabetically)
   * The method will return:
   *   0 if the two strings are equal
   *  -1 if s1 comes before s2 in lexicographical order
   *   1 if s1 comes after s2 in lexicographical order
   * For example:
   *  compareTwoString("apple", "orange") will return -1
   *  compareTwoString("apple", "Banana") will return 1 because lexicographically, capital letters come before the small letters.
   *  compareTwoString("one", "one") will return 0
   */    
  public static int compareTwoString(String s1, String s2) {
    int result = 0;

    // QUESTION 6
    // Write java code to complete this method

    int minLength = Math.min(s1.length(), s2.length());

    for(int i = 0; i< minLength; i++){
      if(s1.charAt(i) != s2.charAt(i)){
        return s1.charAt(i)-s2.charAt(i);
      }
    }
    result= s1.length()-s2.length();
    // End of QUESTION 6
    return result;

  }
  /**
   * This method uses optimized Bubble sort to sort the list of n strings in lexicographical order
   */   
  public static void sortStringList(String[] a) {
    boolean swapped;
    //tao ham swapp

    int n=a.length;
    for(int i=0; i<n-1; i++) {
      swapped = false;
      for(int j = 0; j< n-i-1; j++) {
        if (a[j].compareTo(a[j+1])>0) {
          String temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }

    }
    // QUESTION 7
    // Write java code to complete this method 
  
    // End of QUESTION 7
  }
  
  public static void main(String[]args) {
    int n,m;
    String [] a; 
   
    System.out.println("Please input the integer N:");
    Scanner scanner = new Scanner(System.in);
    n=scanner.nextInt();        
    System.out.println("Please input the integer M:");
    m=scanner.nextInt();        
    //Remove newline character after calling nextInt()
    String tmp=scanner.nextLine();
    
    a=new String[n];
    
    for (int i=0; i<n; i++) {
        System.out.println("Please input the string a["+i+"] " + "(a["+i+"] must have "+ m +" characters):");
        a[i]=scanner.nextLine();
    }        
    
    System.out.println("The list of strings is: ");
    printList(a);

    sortStringList(a);
    System.out.println("The list of sorted strings is: ");
    printList(a);      
    
/*    
    System.out.println(compareTwoString("apple", "orange"));
    System.out.println(compareTwoString("apple", "Banana"));
    System.out.println(compareTwoString("one", "one"));    
*/
  }    
}
