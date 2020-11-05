package tictoctoegame;
import java.util.*;
public class TicTacToeGame 
{
    public char playersymbol,computersymbol;
    public void showBoard(char[] board)
    {
    	System.out.println("Current board:");
    	int count=0;
    	System.out.println("--------------");
    	for(int index=1;index<board.length;index++)
    	{
    		
    		System.out.print(board[index]+" | ");
    		if(count==2 || count==5 || count==8)
    		{
    			System.out.println();
    			System.out.println("--------------");
    		}
    		
    		count=count+1;
    	}
    	
    }
	public void determinesymbol()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Symbol:");
		char symbol = sc.next().charAt(0);
		 if (symbol=='X')
		 {
			 playersymbol='X';
			 computersymbol='O';
			 System.out.println("player:"+playersymbol+" computer:"+computersymbol);
		 }
		 else if (symbol=='O')
		 {
			 playersymbol='O';
			 computersymbol='X';
			 System.out.println("player:"+playersymbol+" computer:"+computersymbol);
		 }
		 else
		 {
			 System.out.println("You have entered character other than X or O");
		 }
		 
	}
	public static void main(String[] args) 
	{
		char[] board = new char [10];
		for(int index=0;index<10;index++)
	    {
			board[index]=' ';
		}
		TicTacToeGame obj1 = new TicTacToeGame();
		obj1.determinesymbol();
		obj1.showBoard(board);
    }

}
