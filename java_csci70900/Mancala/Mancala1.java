// I like the visuals in this Mancala

import java.io.*;
import java.util.*;

public class Mancala1 {

/*This function displays it conceptually as a Mancala board should appear rather than how it is represented by the computer in memory.
We include the indices for debugging purposes and also for reference purposes so that user and AI can verbalize the bucket from which they are taking stones.*/
    public static void drawBoardForUser(int[] gameBoard){

System.out.println("----------------------");


System.out.println("AI");
System.out.print("    "+"#13 ");
System.out.print("#12 ");
System.out.print("#11 ");
System.out.print("#10 ");
System.out.print("#9  ");
System.out.print("#8  ");

System.out.print("\n");


System.out.print(""+"    ["+gameBoard[13]+"] ");
System.out.print("["+gameBoard[12]+"] ");
System.out.print("["+gameBoard[11]+"] ");
System.out.print("["+gameBoard[10]+"] ");
System.out.print("["+gameBoard[9]+"] ");
System.out.print("["+gameBoard[8]+"] ");
System.out.print("\n\n");

System.out.print("#0 ");
System.out.print("<"+gameBoard[0]+">"); //left m
System.out.print("                   ");
System.out.print("#7 ");
System.out.print("<"+gameBoard[7]+">"); 

System.out.print("\n\n");
System.out.println("User");

System.out.print("    "+"#1 ");
System.out.print("#2 ");
System.out.print("#3 ");
System.out.print("#4 ");
System.out.print("#5 ");
System.out.print("#6 ");

System.out.print("\n");



//+ means concatenate or combine strings


System.out.print("    "+"["+gameBoard[1]+"]");
System.out.print("["+gameBoard[2]+"]");
System.out.print("["+gameBoard[3]+"]");
System.out.print("["+gameBoard[4]+"]");
System.out.print("["+gameBoard[5]+"]");
System.out.print("["+gameBoard[6]+"]");


System.out.println();
System.out.println("----------------------");
System.out.println();

}
 
//DEFINING the method
public static int userChoice(int[] gameBoard)
{
  System.out.println("Please select pod 1 -6");
  Scanner myInput = new Scanner(System.in);
  
  //what user types in is assigned to user
  int userPodChoice=myInput.nextInt();
  int counter=gameBoard[userPodChoice];
  
  // increment bins;
int moves=0;
while (gameBoard[userPodChoice]>0)

{
moves=moves+1;

gameBoard[(userPodChoice+moves)%14]=
gameBoard[(userPodChoice+moves)%14] + 1;

//the current index + 1
//subtract 1 from user hand as each stone is added to next pod
gameBoard[userPodChoice]=gameBoard[userPodChoice]-1;
  

}//while
/*
  increment bins;
  taken out and distributed to the other pods until done
  how many stones should be drooped in pods increment by 1 in manacalaboard array from original choice
*/
  return userPodChoice;
}//userChoice


//DEFINING the method
public static int AIChoice(int[] gameBoard)
{
  
Random rn = new Random();
int counter= rn.nextInt(6) + 8;

System.out.println("I selected bucket #"+counter);  
  // increment bins;
int moves=0;
while (gameBoard[counter]>0)

{
moves=moves+1;

gameBoard[counter+moves]=
gameBoard[counter+moves] + 1;

//the current index + 1
//subtract 1 from user hand as each stone is added to next pod
gameBoard[counter]=gameBoard[counter]-1;
  

}//while


  return counter;
}//userChoice


  public static void main(String[] args) {
    //create an array called mancalaBoard with 12 elements each can store an integer
int[] mancalaBoard = new int[14];

    System.out.println("Welcome to Mancala!");

//initialize mancalaBoard

/*
set counter variable to 0; it increases by 1 each time through for loop; is 1 lt than 14; repeat loop; is 14 lt 14 break out of loop
*/


for (int counter=1;counter<14;counter++)
{
mancalaBoard[counter]=4;// short cut to set each circle on the board to equal to 4 stones

  };//for

mancalaBoard[7]=mancalaBoard[0]=0; //7-user 0-Ai

  //diplay the displayMancalaBoard

int stonesOnBoard=60;
while(stonesOnBoard>0)
{

drawBoardForUser(mancalaBoard);

//USING the method
userChoice(mancalaBoard);

//
//AIChoice(mancalaBoard);

//update
for(int counter=0;counter<14;counter++)
stonesOnBoard+=mancalaBoard[counter];
};//while

}//main



}//mancalaBoard


// now player is playing against computer player 1 user player 2 cp

// prompt forn your turn and user chooses a pod from array 0 - 5 aka pod 1 - 6