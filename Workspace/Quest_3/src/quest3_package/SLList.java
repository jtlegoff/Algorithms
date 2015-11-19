package quest3_package;

public class SLList {
	protected SLLNode head = null, tail = null;
	
	public SLList(){
		
	}
	public boolean isEmpty() {
		return head == null;
	}
	public Object first(){
		return head.data;
	}
	public void printAll(java.io.PrintStream out) {
		for(SLLNode tmp = head; tmp != null; tmp = tmp.next)
			out.print(tmp.data);
	}
	public void add(Object el){
		head = new SLLNode(el, head);
		if(tail == null)
			tail = head;
	}
	public Object find(Object el){
		SLLNode tmp = head;
		for(; tmp != null && !el.equals(tmp.data); tmp = tmp.next);
		if(tmp == null)
			return null;
		else return tmp.data;
	}
	public Object deleteHead() {
		Object el = head.data;
		head = head.next;
		return el;
	}
	public void delete(Object el){
		if(head != null)
			if(el.equals(head.data))
				head = head.next;
			else {
				SLLNode pred = head, tmp = head.next;
				for(; tmp != null && !(tmp.data.equals(el)); pred = pred.next, tmp = tmp.next);
				pred.next = tmp.next;
			}
	}
	
}
