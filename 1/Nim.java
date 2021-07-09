import java.io.*;
import java.util.*;

public class Nim{
public static void main(String[] args){
  int bag=12;
  int turn = 0;
  while(bag>0){
    turn++;//turn=turn+1
    if (turn % 2 == 0){
    System.out.println("Turn:  Player");
    System.out.println("Current Stones: "+bag);
    
      bag-=playerRound(bag);
    } else {
    System.out.println("Turn:  Player");
    System.out.println("Current Stones: "+bag);

      bag-=aiRound(bag);
    }//else
  if (turn%2 ==0) {
    System.out.println("Congratulations!  You won!"); 
  }//if
  else {
    System.out.println("The AI won.  Sorry- try again!");
  }//else
  }//while


