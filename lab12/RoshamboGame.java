package lab12;

import java.util.Random;
import java.util.Scanner;

public class RoshamboGame { 

	private static final String If = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Player opponent;
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("");
		System.out.println("Enter your name:");
		String name = scanner.next();
		Player person =  new ScannerPlayer(name);
		System.out.println("Would you like to play against random or rock?");
		
		String choice = scanner.next();
		switch (choice) {
		case "random":
			opponent = new RandomPlayer(choice);
			break;
		case "rock" :
			opponent = new Player();
			break;
		default:
			throw new IllegalArgumentException("Must type 'random' or 'rock'.");
		}
		
		System.out.println("Your opponent chose" + opponent.generateRoshambo());
		
		
		System.out.println(" ROCK (1), PAPER (2), or SCISSORS (3)");
		String Player = scanner.next();  
		
		int Rock = 1, Paper = 2, Scissor = 3;
		int input = 0;
		int Player1;
	
			if (input== Rock);
			{	
			}
		    if( input== Paper);
			{	
			}
		   if ( input == Rock);
	{
	
	}
		Player opponet;
		
		scanner.close(); 
		 
	}

}
 