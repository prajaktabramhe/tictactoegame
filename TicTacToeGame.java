package tictoctoegame;
import java.util.*;
public class TicTacToeGame 
{
    public char playersymbol,computersymbol;
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
		
    }

}
