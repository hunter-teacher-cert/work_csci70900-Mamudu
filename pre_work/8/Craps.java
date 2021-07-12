import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Craps {

	static Random rand = new Random();


	public static int roll(int n){
		//returns a random number between 1 and that number, inclusive
		return rand.nextInt(n+1);
	}

	public static int shoot(int numDice, int maxVal){
		//returns the result of rolling those dice.
		int sum = 0;
		for(int i = 0; i < numDice; i++){
			sum = sum + roll(maxVal);
		}
		return sum;
	}

	public static String round(){
		//should return something to indicate if the shooter of the round wins or loses.

		//The shooter shoots (rolls) two dice.
		int shootResult = shoot(2,6);

		System.out.println("You rolled a " + shootResult);

		if(shootResult == 2 || shootResult == 3 || shootResult == 12){ 
		//If 2,3, or 12,that’s Craps and he loses.
			return  "That's Craps. You LOSE.";
		}else if(shootResult == 7 || shootResult == 11){ 
		//If sum of 7 or 11, that’s a Natural and he wins.
			return "That's a Natural. You WIN!";
		}else{
			System.out.println("You continue to shoot until you roll Point or 7.");
			//the value he rolled is now called the Point
			int point = shootResult;

			boolean shoots = true;
			while(shoots){
				shootResult = shoot(2,6);
				if(shootResult == point){
					shoots = false;
					return "You rolled a " + shootResult + " which is Point so you WIN!";
				}else if(shootResult == 7){
					shoots = false;
					return "You rolled a " + shootResult + " which means you LOSE.";
				}else{
					System.out.println("You rolled a " + shootResult + " which means you roll again!");
				}
			}
			return "End of round!";

		}

	}

    public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		//The main program should take a parameter from the command line
		System.out.println("How many rounds would you like to play?");
		int rounds = in.nextInt();

		//play that many rounds and as it plays indicate each time the shooter wins or loses. 
		for(int i = 0; i < rounds; i++){
			System.out.println("ROUND: "+ i);
			System.out.println(round());
		}
    }
} 