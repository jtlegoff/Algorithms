package Exercise2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.enqueue(new Integer(7));
		queue.enqueue(new Integer(10));
		queue.dequeue();
		queue.enqueue(new Integer(-3));
		System.out.println(queue.firstEL());
	}

}
