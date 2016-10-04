package lab12;

import java.util.Scanner;

public class ScannerPlayer extends Player {
	Scanner sc = new Scanner(System.in);

	public ScannerPlayer(String playerName) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() { 
		// TODO Auto-generated method stub
		System.out.println("rock,paper, or scissors?");
		String userInput = sc.next();
		char firstLetter = userInput.charAt(0);
		if (firstLetter == 'r' || firstLetter == 'p' || firstLetter == 's') {
			switch (firstLetter) {
			case 'r':
				return Roshambo.ROCK;
			case 'p':
				return Roshambo.PAPER;
			case 's':
				return Roshambo.SCISSORS;
			}
		}
		return generateRoshambo();
	}
} 