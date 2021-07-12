import java.io.*;
import java.util.*;
import java.util.Scanner;

public class TimeConversion {

  public static void main(String[] args)
  {
   
      //Creating the Scanner Object
    Scanner userInput = new Scanner(System.in);

      //Output the prompt
    System.out.print("How many seconds? ");
    
      //Wait for the user to input text & varType varname = scanner_obj_name.nextLine();
    int time = userInput.nextInt();
      // converts seconds to hours and minutes
    int hours = (time/3600);
    int minutes = (time%3600/60);
    int seconds = (time%60);

    System.out.print("There are: ");
    System.out.print(hours + " hours");
    System.out.print(", ");
    System.out.print(minutes+ " minutes");
    System.out.print(", ");
    System.out.print(seconds + " seconds");
    System.out.println("."); 
      
  }
}