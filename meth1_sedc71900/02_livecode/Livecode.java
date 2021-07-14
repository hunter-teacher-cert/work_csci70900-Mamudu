/*Create a live-code experience by writing code (or using existing code) and annotating it with teacher-facing comments that would explain how to develop that code live.
Include questions for students, when to pause, when to ask for predictions, purposeful mistakes, etc.

Topic: One Dimensional Arrays
*/

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Livecode {
  public static void main(String[] args){

    //declare null array
    // What do you understand by a null array?
    int[] arr1;
    //System.out.println(arr1);
    //declare array with empty spaces
    //How long will this Array be?
    //What are the initial values in this Array?
    int[] arr2 = new int[5];
    System.out.println(arr2);
    
    //declare array with initial values
    // Write the indexes corresponding to the values in this array
    int[] arr3 = {1,3,5,7,9};
    System.out.println(arr3);
    
    // What will these next 5 lines of code do?
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[3];
    arr[0] = scan.nextInt();
    arr[1] = scan.nextInt();
    arr[2] = scan.nextInt();

    // What will be printed below?
    System.out.println("Contents: " + arr[0] + " " + arr[1] + " " + arr[2]);

    //What will be printed below?
    System.out.println("Sum: " + arr[0] + arr[1] + arr[2]);
  }
}