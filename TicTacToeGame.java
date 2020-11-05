package tictoctoegame;
import java.util.*;
public class TicTacToeGame 
{
    public char player,computer;
	public void determinesymbol()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Symbol:");
		char c = sc.next().charAt(0);
		 if (c=='X')
		 {
			 player='X';
			 computer='O';
			 System.out.println("player:"+player+" computer:"+computer);
		 }
		 else
		 {
			 player='O';
			 computer='X';
			 System.out.println("player:"+player+" computer:"+computer);
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
