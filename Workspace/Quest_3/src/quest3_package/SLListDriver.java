package quest3_package;

public class SLListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLList ll = new SLList();
		ll.add(new String("Test"));
		ll.add(new String("Test2"));
		ll.add(new String("Test3"));
		ll.add(new String("Test4"));
		ll.add(new String("Test5"));
		ll.add(new String("Test6"));
		ll.printAll(System.out);
		ll.delete("Test3");
		System.out.println("");
		ll.printAll(System.out);
		System.out.println("");
		ll.deleteHead();
		ll.printAll(System.out);
		System.out.println("");
		System.out.println(ll.find("Test5"));
		
	}

}
