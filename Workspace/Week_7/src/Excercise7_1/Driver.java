package Excercise7_1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBST mytree = new IntBST();
		
		mytree.insert(13);
		mytree.insert(10);
		mytree.insert(2);
		mytree.insert(12);
		mytree.insert(25);
		mytree.insert(20);
		mytree.insert(31);
		mytree.insert(29);
		
		System.out.println("Trees in order before deleting leaf 29");
		mytree.inorder(mytree.root);
		mytree.deleteByMerging(29);
		System.out.println("\nTrees in order after deleteing leaf 29");
		mytree.inorder(mytree.root);
		mytree.deleteByMerging(31);
		System.out.println("\nTrees in order after deleteing leaf 31");
		mytree.inorder(mytree.root);
		mytree.deleteByMerging(13);
		System.out.println("\nTrees in order after deleteing leaf 13");
		mytree.inorder(mytree.root);
	}

}
