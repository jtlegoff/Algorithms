package exercise3_3;

public class SLListNode {

	public Object info;
	public SLListNode next;
	
	public SLListNode(Object el){
		info = el;
		next = null;
	}
	
	public SLListNode(Object el, SLListNode ptr){
		info = el;
		next = ptr;
	}
}
