package Bonus;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerBST mytree = new PlayerBST();
		
		Player searchPlayer = new Player(25);
		
		mytree.insert(new Player(13));
		mytree.insert(new Player(10));
		mytree.insert(new Player(2));
		mytree.insert(new Player(12));
		mytree.insert(searchPlayer);
		mytree.insert(new Player(20));
		mytree.insert(new Player(31));
		mytree.insert(new Player(29));
		

		
		System.out.println("Players before one is defeated:\n");
		mytree.breadthFirst();
		mytree.deleteByMerging(searchPlayer);
		System.out.println("Players after one is defeated:\n");
		mytree.breadthFirst();

	}

}
