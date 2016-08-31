package labs;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String yesOrNo ;

		System.out.println("Welcome to the Grand Circus Casino!");	
		System.out.println();
do{
		
		System.out.println("How many sides should each die have?");
		int sides= scanner.nextInt();

		int numberOfRolls = 0;
		int numberOfDiceSides = 0;
		Scanner scan= new scan();
		do
		{
		
			numberOfDiceSides = scan.nextInt();
			
		}
		while(numberOfDiceSides < 2);
		
		
		System.out.println("Would you like to roll the dice? (enter 'y' or 'n')");
		
		String choice = scan.nextLine();
		while(choice.equalsIgnoreCase("Y"))
		{
			numberOfRolls++;
			System.out.println("Roll " + numberOfRolls);
			
			
			
			System.out.println("Roll Again? (enter 'y' or 'n')");
			choice = scanner.nextLine();
		
		
		
		
	}

	
	public static int rollADie(int numberOfSides)
	{
		
	}
			}
	
		
