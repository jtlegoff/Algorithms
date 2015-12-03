package Quest8;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] data = new Player[5];
		data[0] = new Player("George Washington", 44);
		data[1] = new Player("Thomas Jefferson", 35);
		data[2] = new Player("John Adams", 40);
		data[3] = new Player("Benjamin Franklin", 58);
		data[4] = new Player("Calvin Coolidge", 53);

		long start, stop, elapsed;
		start = System.currentTimeMillis();
		Quick quick = new Quick();
		quick.quicksortAge(data);
		stop = System.currentTimeMillis();
		elapsed = stop - start;
		quick.display(data);
		System.out.println(elapsed);
		System.out.println("-------------------------------------");
		start = System.currentTimeMillis();
		quick.quicksortName(data);
		stop = System.currentTimeMillis();
		elapsed = stop - start;
		quick.display(data);
		System.out.println(elapsed);
}
}
