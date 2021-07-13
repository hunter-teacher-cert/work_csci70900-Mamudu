//Created by the other team

//pvp Mancala game
//gameboard as single array, starting off with 4 stones in each pit

// M p p p p p p 
//   p p p p p p M

// 0 4 4 4 4 4 4 
//   4 4 4 4 4 4 0

// 13th(p) 12th 11th 10th 9th 8th 7th
//         0th  1st  2nd  3rd 4th 5th  6th(p)

import java.io.*;
import java.util.*;

public class MancalaT {
  
  public static void printGameboard(int[] gameBoard){
    System.out.println();
	
    //Print p2's row
    System.out.print("p2 ");
    
    //Decrement from the last index in the array to index 7. Output as P2's row.
    for(int i = 13; i > 6; i--)  {
      System.out.print(gameBoard[i] + " ");
    }

    //Print a new line and a space before P1's row
    System.out.println();
    System.out.print("     ");

    //Increment from the first index to index 6. Output as P1's row.
    for(int i = 0; i < 7; i++)  {
      System.out.print(gameBoard[i] + " ");
      }
      System.out.println("p1");
	  
	System.out.println();
    }
    
	public static int askPlayer1(int[] gameBoard){
		Scanner in = new Scanner(System.in);
		
		int pocketIndex;
		
		do {
        //Send prompting message.
        System.out.println("Player 1's turn. Choose a pocket to draw from. Input a number from 0 to 5: ");
          
        //Read in their response.
        pocketIndex = in.nextInt();

        //If user enters an invalid number prompt them again to enter a number correctly.
        if(pocketIndex < 0 || pocketIndex > 5){
          System.out.println("Invalid choice. Player choice is out of bounds. Try again.");
		      System.out.println();
        }
        if(gameBoard[pocketIndex] == 0){
          System.out.println("Invalid choice. There are no stones in this pocket. Try again.");
		      System.out.println();
        }
      } while(pocketIndex < 0 || pocketIndex > 5 || gameBoard[pocketIndex] == 0);
	  return pocketIndex;
	}
	
	public static int askPlayer2(int[] gameBoard){
		Scanner in = new Scanner(System.in);
		
		int pocketIndex;
		
		do {
			//Send prompting message.
			System.out.println("Player 2's turn. Choose a pocket to draw from. Input a number from 7 to 12: ");
          
			//Read in their response.
			pocketIndex = in.nextInt();

			//If user enters an invalid number prompt them again to enter a number correctly.
			if(pocketIndex < 7 || pocketIndex > 12){
				System.out.println("Invalid choice. Player choice is out of bounds. Try again.");
				System.out.println();
				}
      if(gameBoard[pocketIndex] == 0){
         System.out.println("Invalid choice. There are no stones in this pocket. Try again.");
		    System.out.println();
        }
		} while(pocketIndex < 7 || pocketIndex > 12 || gameBoard[pocketIndex] == 0);
	  return pocketIndex;
	}
	
	public static int playerMove(int[] gameBoard, int pocketIndex, boolean p1Turn){
		
		//stones is the number of stones in the pocket that will be moved
		int stones;
		
		//Go to index specified, output the value of stones, then set the value to 0
		stones = gameBoard[pocketIndex];

		//user picks up all stones from that pocket
		gameBoard[pocketIndex] = 0;

		while(stones > 0){
			//wrapping around from p2's pit to p1's row 
			if(pocketIndex == 13){
				//going from p2's pit(13th item) to p1's row(0th item)
				pocketIndex = -1;
			}
			
			//players cannot deposit stones in other player's pit
			if(p1Turn == true && pocketIndex == 12){
				pocketIndex = -1;
			} 
			
			if (p1Turn == false && pocketIndex == 5) {
				pocketIndex = 6;
			}
			
			gameBoard[pocketIndex + 1]++; //Drop one stone in each subsequent pit
			pocketIndex++; //Increase the pit index by 1
			stones--; //Decrease the stones in your hand by 1
		}
		return pocketIndex;
	}
	
  public static void main(String[] args) {

  //Create a static array to represent the starting gameboard
  int[] startingBoard = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};
  
  //showing users initial game board
  printGameboard(startingBoard);
  
  //pocket is index from which we're drawing stones
	//player1Turn indicates whether or not it's p1's turn
  int pocket;
	boolean player1Turn;

	//keep playing until either player has no more stones in their pockets
  while( (startingBoard[0] + startingBoard[1] +startingBoard[2] + startingBoard[3] + startingBoard[4] + startingBoard[5] != 0) && (startingBoard[7] + startingBoard[8] +startingBoard[9] + startingBoard[10] + startingBoard[11] + startingBoard[12] != 0) ) {
      
    //First player's turn. 
    player1Turn = true;
    pocket = askPlayer1(startingBoard);

    //Executing first player's move
    pocket = playerMove(startingBoard, pocket, player1Turn);
  
    //if p1's last stone falls in p1's pit, p1 goes again
    if(pocket == 6){
      System.out.println("Good move! Go again.");
      printGameboard(startingBoard);
      pocket = askPlayer1(startingBoard);
      pocket = playerMove(startingBoard, pocket, player1Turn);
    }
	  
    printGameboard(startingBoard);
	  
	  //Second player's turn.
	  player1Turn = false;
	  pocket = askPlayer2(startingBoard);
	  
	  //Executing second player's move
	  pocket = playerMove(startingBoard, pocket, player1Turn);
	  
    //if p2's last stone falls in p2's pit, p2 goes again
    if(pocket == 13){
      System.out.println("Good move! Go again.");
      printGameboard(startingBoard);
      pocket = askPlayer2(startingBoard);
      pocket = playerMove(startingBoard, pocket, player1Turn);
    }
    printGameboard(startingBoard);
    
    }
      //If one player has 0 stones in their row the game ends
      System.out.print("Game over! ");

      //Calculate the number of stones each player has
      int p1score = startingBoard[0] + startingBoard[1] +startingBoard[2] + startingBoard[3] + startingBoard[4] + startingBoard[5];
      int p2score = startingBoard[7] + startingBoard[8] +startingBoard[9] + startingBoard[10] + startingBoard[11] + startingBoard[12];

      //Print out the winner
      if (p1score > p2score){
        System.out.println("Player 1 wins!");
      } else if (p1score < p2score) {
        System.out.println("Player 2 wins!");
      } else {
        System.out.println("It's a tie!");
    }
  }
}
