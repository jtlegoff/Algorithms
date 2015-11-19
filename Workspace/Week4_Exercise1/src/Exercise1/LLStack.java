package Exercise1;

public class LLStack {
	private java.util.LinkedList<Object> list = new java.util.LinkedList<Object>();

	public LLStack(){
		
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public Object topEl(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.getLast();
	}
	
	public Object pop(){
		if(isEmpty())
			throw new java.util.EmptyStackException();
		return list.removeLast();
	}
	
	public void push(Object el){
		list.addLast(el);
	}
	public String toSting(){
		return list.toString();
	}
}
