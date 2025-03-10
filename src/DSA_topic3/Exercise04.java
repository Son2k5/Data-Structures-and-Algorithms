/**
 * The program maintains a data set of n students with their names and marks, and print out a list of m students who has highest mark.
 * A O(n) sorting algorithm is used to sort the list of students based on their marks.
 * @author (nxthang) 
 * @version (1.0)
 */
package DSA_topic3;

import java.util.Scanner;
import java.lang.String;

public class Exercise04 {
  /**
   * Constructor for objects of class Exercise02
   */
  public Exercise04() {
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
   * This method uses Counting Sort to sort the list of n students by their marks
   * The list is sorted in descending order
   */    
  public static void sortStudentByMark(String[] names, int[] marks) {

    int n = marks.length;
    int[] count = new int[11];
    String[] output_names = new String[n];
    int[] output_marks = new int[n];

    // QUESTION 4
    // Write java code to: Initialize count array with all zeros;
    // Store the count of each element; 
    // Calculate the cumulative count of each array

      // khởi tạo mảng count định dạng điểm từ 1 đến 10 có giá trị khởi tạo đều bằng 0 số lượng học sinh
      for(int i=0; i<11; i++) {
          count[i] = 0;
      }

      // Thực hiện lưu trữ số lần xuất hiện mỗi điểm ví dụ điểm 2 xuất hiện 2 lần
      for(int i=0; i<n; i++) {
          count[marks[i]]++; // ví dụ tại số 1 học sinh được điểm 5 sẽ lưu vào vị trí số 4 trong mảng count
      }

      // tạo mảng cộng dồn để cộng cac gia so luongj trong máng
      for (int i=1; i<11; i++) {
          count[i] += count[i-1];
      }

    
    // End of QUESTION 4

    // QUESTION 5
    // Write java code to find the index of each element of the original array in count array, 
    // place the elements in output array;
    // Copy the sorted elements into original array
      // Hàm tim tất cả phần tử từ mảng gốc v đặt chúng vào mảng đầu ra
      for (int i = n - 1; i >= 0; i--) {
          int mark = marks[i];
          int index = count[mark] - 1;
          output_marks[index] = mark;
          output_names[index] = names[i];
          count[mark]--;
      }

      // Sao chép các phần tử đã sắp xếp vào mảng gốc.
      for (int i = 0; i < n; i++) {
          marks[i] = output_marks[i];
          names[i] = output_names[i];
      }
    
    // End of QUESTION 5  
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
