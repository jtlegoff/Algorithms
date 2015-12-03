package exercise3_1;

public class IntSSLNode {

	
	public int info;
	public IntSSLNode next;
	
	public IntSSLNode(int i){
		this(i, null);
	}
	
	public IntSSLNode(int i, IntSSLNode n){
		info = i;
		next = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting integer nodes");
		
		IntSSLNode p = new IntSSLNode(10);
		System.out.println(p.info);
		p.next = new IntSSLNode(8);
		System.out.println(p.next.info);
		p.next.next = new IntSSLNode(50);
		System.out.println(p.next.next.info);
		p.next.next.next = new IntSSLNode(13);
		System.out.println(p.next.next.next.info);
		p.next.next.next.next = new IntSSLNode(-12);
		System.out.println(p.next.next.next.next.info);
	}

}
