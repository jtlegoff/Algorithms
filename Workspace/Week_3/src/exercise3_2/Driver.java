package exercise3_2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSLList ll = new IntSLList();
		ll.addToHead(8);
		ll.addToHead(7);
		ll.addToTail(20);
		ll.addToHead(5);
		ll.addToHead(-12);
		ll.delete(7);
		ll.printAll();
	}

}
