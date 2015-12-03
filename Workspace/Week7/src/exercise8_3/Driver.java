package exercise8_3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] data = new Integer[5];
		data[0] = new Integer(5);
		data[1] = new Integer(2);
		data[2] = new Integer(3);
		data[3] = new Integer(8);
		data[4] = new Integer(1);

	
		Quick quick = new Quick();
		quick.quicksort(data);
		quick.display(data);
}
}
