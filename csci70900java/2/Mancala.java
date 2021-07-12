// 2/Mancala.java
//Collaborators: Marisa Laks, Julian Irimina, Mamadu Wally

/*
We need to know how many stones are in each pot and how to store the new amounts after dropping them

*/

import java.util.Scanner;

public class Mancala {

public static void play () {
/*
  int [] AIpot = new int[7];
  int [] mypot = new int[7];

  AIpot [0] = 0;
  AIpot [] = 4;
  mypot [] = 4;
  mypot [6] = 0;

*/  

   //pot 0 is AI big pot, pot 1 - 6 are AI little pots, pot 7 - 12 are my little pots, pot 13 is my big pots

   //I choose from pots 7 - 12. In my turn I will never drop a stone into pot 0. After 13 I go to 6. Then to 5. 


  int [] pot = new int[14];
  pot [0] = 0;  //AI big pot
  pot [1] = 4;  //AI pot
  pot [2] = 4;  //AI pot
  pot [3] = 4;  //AI pot
  pot [4] = 4;  //AI pot
  pot [5] = 4;  //AI pot
  pot [6] = 4;  //AI pot
  pot [7] = 4;  //my pot
  pot [8] = 4;  //AI pot
  pot [9] = 4;  //AI pot
  pot [10] = 4; //AI pot
  pot [11] = 4; //AI pot
  pot [12] = 4; //AI pot
  pot [13] = 0; //My big pot
  
  
  System.out.println ("Which pot would you like to pick from? Choose from pots 7 - 12. ");

  Scanner choice = new Scanner(System.in);
  int n = choice.nextInt();


 //start at index n and add one to each of the following pots.

/*
  int stones = 4;
  if (n = pot [7]) {
    for (i = 7; i <=11; i++) {
     pot[i] = pot[i] + 1;
    }
  }

  if (n = pot [8]) {}
  if (n = pot [9]) {}
  if (n = pot [10]) {}
  if (n = pot [11]) {}
  if (n = pot [12]) {}
  */

}


public static void main (String[] args) {
  System.out.println("This is the game of Mancala. The object of the game is to collect as many stones as possible. Each player picks up stones from their side and drops them in the pots.");

  System.out.println();
  int [] pot = new int[14];

  System.out.print("0");
  for(int i =1; i<=6; i++) {
    System.out.print(" 4");
    }
    System.out.println();

  for(int i = 7; i<= 12; i++) {
    System.out.print(" 4");
    }
  System.out.println(" 0");
  System.out.println();

  play();
}
  
}
