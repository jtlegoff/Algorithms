package exercise3_3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLList genericLL = new SLList();
		
		genericLL.add(new Integer(5));
		genericLL.add(new String("Josh"));
		genericLL.add(10);
		genericLL.add(-12);
		genericLL.printAll(System.out);
	}

}
