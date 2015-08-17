package dotcomgame;
import java.util.Scanner;
import java.util.ArrayList;

public class SimpleDotGameV2 {
	private ArrayList<String> locationCells;
	private int numOfHits = 0;
	int amountGuesses;

	
	public void setLocationCells2(ArrayList<String> locs){
		locationCells = locs;
	}
	
	public String userGuess2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your guess:");
		String input = scan.nextLine();
		return input;
		
	}
	
	public String checkGuess2(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		int index = locationCells.indexOf(userGuess);
		if (index >=0) { 
			locationCells.remove(index);
			if (locationCells.isEmpty()){
				result = "kill";
			} else {
				result = "hit";
			}
			
		}
		return result; }
		
		
		
	public void rating2(int guessNum) {
		 amountGuesses = guessNum;
		if (guessNum <= 3) 
			System.out.println("You are a DotCom blowing up Rock Star!");
		else if (guessNum<=5)
			System.out.println("Not Bad");
		else
			System.out.println("You need to work on your guessing skills!");
	}
	

	

}
