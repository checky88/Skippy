package skippy;

import java.util.ArrayList;

/*Represents the kangaroo in the simulation. Instance variables include his location,
 *  which is initially (0,0). Provides these methods:
hop: take a random hop in one direction
at_home(): return true iff at home
move (direction) move kangaroo in the given direction
*/
public class Kangaroo {
	private int Coordinate1 = 0;
	private int Coordinate2 = 0;
	
	public void setLocationCell(int loc1,int loc2) {
		Coordinate1 = loc1;
		Coordinate2 = loc2;
		Grid.putKangrooOnGrid(loc1,loc2);
	}
	
	public void hop() {	
		do{
		String direction = Dice.throwDice();
		//String direction = "West";
		//System.out.println("Direction = " + direction);
		
		if(direction == "North"){
			Coordinate1--;
			if (Grid.lies_outside(Coordinate1,Coordinate2)){
				Coordinate1++;
			}
			else{
				setLocationCell(Coordinate1, Coordinate2);	
			}				
			
		}else if (direction == "South"){
			Coordinate1++;
			 if(!Grid.lies_outside(Coordinate1,Coordinate2))
				 setLocationCell(Coordinate1, Coordinate2);
			 else
			 Coordinate1--;
		}else if (direction == "East"){
			Coordinate2++;
			 if(!Grid.lies_outside(Coordinate1,Coordinate2))
				 setLocationCell(Coordinate1, Coordinate2);
			 else
				 Coordinate2--;
		}else if (direction == "West"){
			Coordinate2--;
			if(Grid.lies_outside(Coordinate1,Coordinate2))
				 Coordinate2++;
			 else
				 setLocationCell(Coordinate1, Coordinate2);
				
		}
		}while(!Point.comparePoint(Coordinate1, Coordinate2));
	}
	
}
