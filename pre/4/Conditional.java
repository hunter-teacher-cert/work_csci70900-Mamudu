// NOT a required assignment

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Conditional {
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter your number? ");
    
      //Wait for the user to input text & varType varname = scanner_obj_name.nextLine();
    int num = userInput.nextInt();

    if (num % 2 == 0) {
     System.out.println("Your number is even");
  } else {
     System.out.println("Your number is odd");
}
  
  }
}