package Quest4;

public class SoundStack {
	private java.util.LinkedList<Sound> list = new java.util.LinkedList<Sound>();
	
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
	
	public void push(Sound el){
		list.addLast(el);
	}
	public String toSting(){
		return list.toString();
	}
	
}
