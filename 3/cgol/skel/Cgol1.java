/** Mamudou, Mr. H, Lyuba */
import java.io.*;
import java.util.*;

/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/

public class Cgol1
{

  //initialize empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols) {
	char [][]board = new char[rows][cols];
	for(int i = 0; i < rows; i++)
	{
		for(int j = 0; j < cols; j++)
		{
			board[i][j] = ' ';
		}
	}
	return board;
  }


  //print the board to the terminal
  public static void printBoard(char[][] board) {
	for(int i = 0; i < board.length; i++)
	{
		for(int j = 0; j < board[i].length; j++)
		{
			System.out.print(board[i][j] + "|");
		}
		System.out.println();
	}
  }


  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val){
	board[r][c] = val;
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


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell(char[][] board,int r, int c) {
	/*
	   Survivals:
	   * A cell with 2 or 3 living neighbours will survive for the next generation.
	   Death:
	   * Each cell with >3 neighbours will die from overpopulation.
	   * Every cell with <2 neighbours will die from isolation.
	   Birth:
	   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
	*/
	int numNeighbors = countNeighbours(board, r, c);
	if(numNeighbors == 2 && board[r][c] == 'X') //a cell with 2 neighbors that is already alive
	{
		return 'X';
	}
	else if(numNeighbors > 3)
	{
		return ' ';
	}
	else if(numNeighbors < 2)
	{
		return ' ';
	}
	else if( numNeighbors == 3)
	{
		return 'X';
	}
	else
	{
		return ' ';
	}
  }


  //generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {
	char[][] newBoard = new char[board.length][board[0].length]; //board.length: rows, board[0].length:columns
	for(int i = 0; i < board.length; i++)
	{
		for(int j = 0; j < board[i].length; j++)
		{
			newBoard[i][j] = getNextGenCell(board, i, j);
		}
	}
	return newBoard;
  }


  public static void main( String[] args )
  {
    
    char[][] board;
    //board = createNewBoard(25,25);
	board = createNewBoard(5, 5);

    //breathe life into some cells:
    setCell(board, 0, 0, 'X');
    setCell(board, 0, 1, 'X');
    setCell(board, 1, 0, 'X');

    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");

    board = generateNextBoard(board);

    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class