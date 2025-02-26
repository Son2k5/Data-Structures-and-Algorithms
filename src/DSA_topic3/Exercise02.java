/**
 * The program maintains a data set of n students with their names and marks,
 * and print out a list of m students who has highest mark.
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
package DSA_topic3;

import java.util.Scanner;
import java.lang.String;

public class Exercise02 {
  /**
   * Constructor for objects of class Exercise02
   */
  public Exercise02() {
  }

  public static void printStudentList(String[] names, int[] marks) {
    int n = marks.length;
    System.out.println();        
    System.out.println("The list of " + n +" students is");
    for (int i=0; i<n; i++)
      System.out.println("Name: "+names[i]+"  Mark: "+ marks[i]);
    System.out.println();    
  }

  /**
   * This method uses Selection Sort to sort the list of n students by their marks
   * The list is sorted in descending order
   */    
  public static void sortStudentByMark(String[] names, int[] marks) {
    // QUESTION 2
    // Write java code to implement this method    
    int n = marks.length;
    for(int i=0; i<n-1; i++){
        int index = i;
        for(int j=i+1; j<n; j++){
            if(marks[j]>marks[index]){
                index = j;
            }
        }
        int tempMark = marks[i];
        marks[i] = marks[index];
        marks[index] = tempMark;

        String tempName = names[i];
        names[i] = names[index];
        names[index] = tempName;
    }

    
    // End of the method  
  }
  
  /**
   * This method shows the first M students from the sorted list
   */    
  public static void showStudents(String[] names, int[] marks, int m) {
    System.out.println("The list of " + m +" students who has the highest mark is:");
    for (int i=0; i<m; i++)
        System.out.println("Name: "+names[i]+"  Mark: "+ marks[i]);
  }
  
  public static void main(String[]args)
  {
      int n,m;
      int[] marks;  
      String[] names;

      System.out.println("How many students in the list? ");
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();        
      System.out.println("Please input M: ");
      m = scanner.nextInt();               
      
      //Remove newline character after calling nextInt()
      String tmp=scanner.nextLine();            
      
      marks = new int[n];
      names = new String[n];
      
      for (int i=0; i<n; i++) {
          System.out.println("Please input the name and mark of student "+ (i+1) +":");
          System.out.println("Name: ");
          names[i] = scanner.nextLine();
          System.out.println("Mark: ");            
          marks[i] = scanner.nextInt();
          //Remove newline character after calling nextInt()
          tmp = scanner.nextLine();            
      }               

      printStudentList(names,marks);
      sortStudentByMark(names,marks);
      showStudents(names,marks,m);
  }    
}
