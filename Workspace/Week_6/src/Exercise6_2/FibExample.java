package Exercise6_2;

public class FibExample {

	public static void main(String[] args) {
		int y = nonRecFib(7);
		System.out.println(y);

	}
	
	static public int nonRecFib(int n){
		
		int returnResult = 0;
		int fib1 = 1;
		int fib2 = 1;
		
		for(int i =2; i < n; i ++)
		{
			returnResult = fib1 + fib2;
			fib2 = fib1;
			fib1 = returnResult;
		}
		
		return returnResult;
		
	}

}
