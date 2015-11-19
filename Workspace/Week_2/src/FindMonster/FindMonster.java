package FindMonster;

public class FindMonster {

	public static int[] FindMonster(int[][] grid){
		
		int[] coordinates = new int[2];
		
			for(int rows = 0; rows < grid.length; rows++){
				for(int col = 0; col < grid[rows].length; col++){
					if(grid[rows][col] == 1){
						System.out.println("You found the monster!!");
						coordinates[0] = rows;
						coordinates[1] = col;
					}
				}
			}
				return coordinates;
				
	}
	
	public static int[][] InsertMonster(int[][] grid){
		
		for(int rows = 0; rows < grid.length; rows++){
			for(int col = 0; col < grid[rows].length; col++){
					grid[rows][col] = 0;
			}
		}
		
		//grid[(int) Math.abs((Math.round((Math.pow(Math.random(), Math.log(10*grid.length))))%grid.length))]
			//	[(int) Math.abs((Math.round((Math.pow(Math.random(), Math.log(10*grid[0].length))))%grid.length))] = 1;
		
		grid[(int) Math.abs(Math.round((Math.random()*10 - 2)%grid.length))]
				[(int) Math.abs(Math.round((Math.random()*10 - 2)%grid[0].length))] = 1;
		

		return grid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] monsterGrid = new int[8][8];
		InsertMonster(monsterGrid);
		int[] monsterCoords = FindMonster(monsterGrid);
		System.out.println("Monster is located at coordinates: (" + monsterCoords[0] + ", " + monsterCoords[1] + ")!");
	}

}
