package Exercise6_1;

public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double y = Fib(8);
			System.out.println(y);
	}
	
	static double Fib(int n){
		if( n < 2 )
			return n;
		
		return (Fib(n - 2) + Fib(n - 1));
	}

}
