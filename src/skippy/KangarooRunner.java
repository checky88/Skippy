package skippy;

import java.util.ArrayList;
import java.util.Scanner;

public class KangarooRunner {

	public static void main(String[] args) {
		int gridSize;
		/// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please the grid >1:");
		gridSize = keyboard.nextInt();
		
		System.out.println("GRIDSIZE = :"+ gridSize);
		Grid grid = new Grid();
		grid.setGridSize(gridSize);
		
		int loc1 = gridSize - 1;
		int loc2 = 0;
		
		
		Kangaroo kangaroo = new Kangaroo();
		kangaroo.setLocationCell(loc1,loc2);
		kangaroo.hop();
		
		//Grid.lies_outside();
	      
	      //final location
	     
	     // String userGuess = "2";
		  //Dice.getDiceValue();

	}



}
