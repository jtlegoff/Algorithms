package excercise8_1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The unsorted order:");
		Bubble bubble = new Bubble();
		bubble.printData();
		bubble.sort(bubble.data);
		System.out.println("The sorted order:");
		bubble.printData();
	}

}
