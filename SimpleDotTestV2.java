/*package dotcomgame;
import java.util.ArrayList;
import java.util.Random;

public class SimpleDotTestV2 {
	public static void main(String[] args){
	int numOfGuesses = 0;
	Boolean isAlive = true;
	
	SimpleDotGameV2 game2 = new SimpleDotGameV2();
	int randomNumber = (int)(Math.random()*5);
	ArrayList<SimpleDotTestV2> location = new ArrayList<SimpleDotTestV2>();
	location.add(randomNumber);
	location.add(randomNumber+1);
	location.add(randomNumber+2);
	
		
	
	game2.setLocationCells2(location);

	
	System.out.println("This is a very simple game. The objective is to sink a simple dotcom\n"
			+ "(sorry, you won't get your investment money back).");
	System.out.println();
	System.out.println("You will guess a number between 0-6. The dotcom takes three spaces to kill.\nGood luck!\n");
	
	while (isAlive == true) {
		String guess= game2.userGuess2();
		String result = game2.checkGuess2(guess);
		numOfGuesses++;
		if(result=="kill") {
			isAlive = false;	
		}
			
		
	}
	
	System.out.println("Your number of guesses: " + numOfGuesses);
	game2.rating2(numOfGuesses);
	

}		}
	
	
	

*/