package dotcomgame;

import java.util.Random;

public class SimpleDotTest {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		Boolean isAlive = true;
		
		SimpleDotGame game = new SimpleDotGame();
		int randomNumber = (int)(Math.random()*5);
		int[] location =  {randomNumber, randomNumber+1, randomNumber+2};
		
		game.setLocationCells(location);
		
		System.out.println("This is a very simple game. The objective is to sink a simple dotcom\n"
				+ "(sorry, you won't get your investment money back).");
		System.out.println();
		System.out.println("You will guess a number between 0-6. The dotcom takes three spaces to kill.\nGood luck!\n");
		
		while (isAlive == true) {
			String guess= game.userGuess();
			String result = game.checkGuess(guess);
			numOfGuesses++;
			if(result=="kill") {
				isAlive = false;	
			}
			
			
			
		}
		
		System.out.println("Your number of guesses: " + numOfGuesses);
		game.rating(numOfGuesses);
		
	
	}		
		
		
	}
		
		
		
		
		
	




/*while (hit<3)
{
if (userGuess == gameField) {
		
	System.out.println("You sunk my ship!");
} else{

System.out.println("Try again!");
game.userGuess();
hit++;

}


}*/



/*int userGuess = game.userGuess();

game.checkGuess();
loc = game.getLocation();
while (userGuess != loc) {
	game.userGuess();
	game.checkGuess();
	hit++;
	if (hit == 3)
		System.out.println("Too many tries. All done");*/