package skippy;

public class Dice extends KangarooRunner{
	private static String DiceValue;
	
	private static int throwDiceCount = 0;
	
	private static int LandedOnNorth = 0;
	private static int LandedOnSouth = 0;
	private static int LandedOnEast = 0;
	private static int LandedOnWest = 0;
	
	public static void getDiceValue(){
		throwDice();
		System.out.println("The Value of dice is "+ DiceValue);
	}
	
	private static float getPrecentage(int currentValue){
		float Percentage;
		Percentage = (currentValue * 100) / throwDiceCount;
		
		return Percentage;
	}
	
	static String throwDice(){
		
		throwDiceCount++;
		int minimum = 1;
		int maximum = 4;
			
		int randomNum = minimum + (int)(Math.random() * maximum); 
		
		switch (randomNum) {
	    case 1:  DiceValue = "North";
	    		 LandedOnNorth++;
	             break;
	    case 2:  DiceValue = "South";
	    		 LandedOnSouth++;
	             break;
	    case 3:  DiceValue = "East";
	    		 LandedOnEast++;
	             break;
	    case 4:  DiceValue = "West";
	    		 LandedOnWest++;
	             break;
		}
		
		return DiceValue;
	}
	
	
	public static void stats(){
		
		
		System.out.println("Total number of times thrown is: "+ throwDiceCount);
		System.out.println("The number of times landed on North is "+ getPrecentage(LandedOnNorth)+"%");
		System.out.println("The number of times landed on South is "+ getPrecentage(LandedOnSouth));
		System.out.println("The number of times landed on East is "+ getPrecentage(LandedOnEast));
		System.out.println("The number of times landed on West is "+ getPrecentage(LandedOnWest));
		
		//return throwDiceCount;
		
	}
	
}
