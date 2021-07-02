import java.io.*;
import java.util.*;

public class Cgol1 {
  public static int neighbor(char [][]board, int r, int c)
  {
    if( r < 0 || c < 0 )
	    return 0;
  
    if(r > board.length - 1 || c > board[r].length - 1)
	    return 0;
    if(board[r][c] == 'X')
	  {
	    return 1;
	  }
    else return 0;
}
}
  //This method checks to make sure row r and column c is not off the end of the board, and then checks if there is a living cell present.
  public static int livingCell(char [][]board, int r, int c)
  {
	  //if the row/col is off the edge of the board, return 0 - not a living cell
	  if( r < 0 || c < 0 )
		  return 0;
	  if(r > board.length - 1 || c > board[r].length - 1)
		  return 0;
	  if(board[r][c] == 'X')
	  {
		  return 1;
	  }
	  else return 0;
  }
  //return number of living neigbours of board[r][c]
  public static int countNeighbours(char[][] board, int r, int c) {
	int neighbors = 0;
	//check above
	neighbors += livingCell(board, r - 1, c - 1);
	neighbors += livingCell(board, r - 1, c);
	neighbors += livingCell(board, r - 1, c + 1);
	//check below
	neighbors += livingCell(board, r + 1, c - 1);
	neighbors += livingCell(board, r + 1, c);
	neighbors += livingCell(board, r + 1, c + 1);
	//check adjacent
	neighbors += livingCell(board, r, c - 1);
	neighbors += livingCell(board, r, c + 1);
	return neighbors;
  }

  public static void main(String[]args){

    
  }