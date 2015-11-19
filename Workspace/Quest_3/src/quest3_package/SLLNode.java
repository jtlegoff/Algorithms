package quest3_package;

public class SLLNode {
	public Object data;
	public SLLNode next;
	
	public SLLNode() {
		next = null;
	}
	
	public SLLNode(Object el) {
		data = el;
		next = null;
	}
	
	public SLLNode(Object el, SLLNode ptr){
		data = el;
		next = ptr;
	}
}
