package dotcomgame;
import java.util.*;
import java.util.Scanner;

public class DotCom {
	
	private ArrayList<String> locationCells;
	private ArrayList<DotCom> dotcomLoc = new ArrayList<DotCom>();
	private int numOfHits = 0;
	int amountGuesses;
	String name;

	public void setupGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("Comcast.com");
		DotCom three = new DotCom();
		three.setName("Sprint.com");
		dotcomLoc.add(one);
		dotcomLoc.add(two);
		dotcomLoc.add(three);
		
		System.out.println("In this game, you will be busting three different DotComs (sorry, we cannot refund any investments lost!)");
		System.out.println("You will be searcing for Pets.com, Comcast.com, and Sprint.com on a 7x7 grid.");
		System.out.println("Try to sink them all in the least amount of guesses. Good Luck!");
		
		for (int i; i<dotcomLoc.length; i++) {
			
		}
		
		
		
	}
	
	public void setName(String n) {
		name = n;
	}

	
	
		

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
