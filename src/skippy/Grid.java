package skippy;

/*
Represents the grid that Skippy is hopping about on.
One key method:
lies_outside(point): return true iff given point is outside grid
*/

public class Grid {
	static int gridSize;
	//static int [][] grid = new int[getGridSize()][getGridSize()];
	static int [][] grid;
	
	private static int getGridSize() {
		return gridSize;
	}
	
	public  void setGridSize(int gridSize){
		 grid = new int[gridSize][gridSize];
		this.gridSize = gridSize;
		
	}


     
     
	public static void putKangrooOnGrid(int num, int col){
		grid[num][col]=1;
		 System.out.println("--------------------");
		/*for(int r=0;r<grid.length;r++){
	        for(int c=0;c<grid[r].length;c++){
	            System.out.print(grid[r][c]);
	        }
	        System.out.println("");
		}
*/	}
	
	public static boolean lies_outside(int num, int col){
		
		if (num <0 || num > getGridSize() - 1 || col <0 || col > getGridSize() - 1 ){
			//num -= 6;
			if (num > getGridSize() - 1 )
			num = num - (getGridSize() - 1);
			
			if (col > getGridSize() - 1 )
			col = col - (getGridSize() - 1);
			
			
			
		    System.out.println("Oops,hit the boundary: ("+num+", "+col+")");
			return true;
		}
		else 
		return false;
	
		// int num1 = 0;
		// int col1 = 6;
		//kangroo location
		// grid[num][col]=1;
		//grid[num1][col1]=1;
		//grid[1][0] = point;

		
		//Point.comparePoint(num, col);
		

		
		
		
		

		
	}





	
	
	
	
}
