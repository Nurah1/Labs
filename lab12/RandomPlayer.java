package lab12;

import java.util.Random;

public class RandomPlayer extends Player{
	Random rdm = new Random();
	
	public RandomPlayer(String name){
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
	int random = (int) (Math.random()*3) +1;
	
	switch (random){
	case 1:
		return Roshambo.ROCK;
	case 2 :
		return Roshambo.PAPER;
	case 3: 
		return Roshambo.SCISSORS;
		
		default:
			return null;
			
	}
		
	}
	
	

}
