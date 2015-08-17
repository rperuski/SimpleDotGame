package dotcomgame;
import java.util.Scanner;



public class SimpleDotGame {
	int[] locationCells;
	int numOfHits = 0;
	int amountGuesses;
	
	

	
	public void setLocationCells(int[] locs){
		locationCells = locs;
	}
	
	public String userGuess() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your guess:");
		String input = scan.nextLine();
		return input;
		
	}
	
	public String checkGuess(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		for(int cell : locationCells) {
			if (guess == cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		
		}
		System.out.println(result);
		return result;
		
	}
	public void rating(int guessNum) {
		 amountGuesses = guessNum;
		if (guessNum <= 3) 
			System.out.println("You are a DotCom blowing up Rock Star!");
		else if (guessNum<=5)
			System.out.println("Not Bad");
		else
			System.out.println("You need to work on your guessing skills!");
	}
	

}





