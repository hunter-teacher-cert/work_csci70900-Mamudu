//collaborators: mamudu	wilsoneg3	mlaks23

import java.io.*;
import java.util.*;



public class ModeT{
    private ArrayList<Integer> inputData;
    private Random r;
    
    public ModeT(){
	      r = new Random();
	      inputData = new ArrayList<Integer>();

	      for (int i=0; i < 20; i++){
	          inputData.add(r.nextInt(20));
	          }
    }
    public ModeT(int size){
	      r = new Random();
	      inputData = new ArrayList<Integer>();

	      for (int i=0; i < size; i++){
	          inputData.add(r.nextInt(50));
	      }
         }

    /**
     * Warmup 1

     Find and return the smallest value in  InputData.
    */

    public int findSmallestValue(){

      int smallest = inputData.get(0);
      for (int i=0;i<inputData.size();i++){
         if (inputData.get(i) < smallest) {
          smallest = inputData.get(i);
         }
      } //end of loop

	      return smallest;

    } //end of findSmallestValue

    /**
     * Warmup 2

     Returns the frequency of value in inputData, that is, how often value appears
    */
    public int frequency(int value){
        int count = 0;
        for (int i = 0; i<inputData.size(); i++) {
          if(value == inputData.get(i)) { //find input value
            count++;  
          } //end of if
        } 
            return count;
         
        } //end of frequency


	    
    

    /**
     *
     This function should calculate and return the mode of inputData.
     The mode is the value that appears most frequently so if inputData contained
     5,3,8,2,5,9,12,5,12,6,5, the mode would return 5 since 5 appears four times.

     If there are multiple modes such as in the case with this data set: 5,5,2,9,9,6 you should return
     either of them (the 5 or the 9).

     Note: you will probably use the frequency function you wrote in
     this solution but not findSmallestValue. the findSmallestValue
     function will help you find a strategy for approaching finding the mode.
    */

    //based on Daiana's code
    public int calcModeT(){
      int freq = frequency(inputData.get(0));
      int valFreq = inputData.get(0);
      for(int i = 0; i < inputData.size(); i++) {
        int nextFreq = frequency(inputData.get(i));
        if(freq < nextFreq) {
          freq = nextFreq;
          valFreq = inputData.get(i);
        }

      }
	      return valFreq ;  //return the value of index with highest count
    }
    public String toString(){
	      return ""+inputData;
    }
}
