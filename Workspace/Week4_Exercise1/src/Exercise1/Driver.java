package Exercise1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLStack stack = new LLStack();
		stack.push(new Integer(10));
		stack.push(new Integer(5));
		stack.push(new Integer(7));
		stack.push(new Integer (11));
		stack.pop();
		stack.push(new Integer(11));
		System.out.println((((Integer)stack.topEl()).toString()));
	}

}
