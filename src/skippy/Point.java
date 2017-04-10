package skippy;

/*class Point
Represents a point in the grid. Provides these methods:
== compare two points for equality
*/
public class Point {
	public static int location = 0;
	public static int locationb = 6;

	//locationb = userinput -1;

	
	static boolean comparePoint(int num,int col){
		System.out.println("Hopped to: ("+num+", "+col+")");
		if (num==location && col == locationb){
			Dice.stats();
			return true;
		}
		else return false;
		
	}
	
}
