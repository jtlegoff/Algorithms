package quest3_package2.copy;

public class CharacterLList {
	protected CharacterNode head = null, tail = null;
	
	public CharacterLList(){
		
	}
	public boolean isEmpty() {
		return head == null;
	}
	public Character first(){
		return (Character) head.data;
	}
	public void printAll(java.io.PrintStream out) {
		for(CharacterNode tmp = head; tmp != null; tmp = tmp.next)
			out.print(tmp.data.getName());
	}
	public void add(Character el){
		head = new CharacterNode(el, head);
		if(tail == null)
			tail = head;
	}
	public Character find(Character character){
		CharacterNode tmp = head;
		for(; tmp != null && !character.equals(tmp.data.getName()); tmp = tmp.next);
		if(tmp == null)
			return null;
		else return (Character) tmp.data;
	}
	public Character deleteHead() {
		Character el = (Character) head.data;
		head = head.next;
		return el;
	}
	public void kill(Character character){
		if(head != null)
			if(character.getName().equals((head.data.getName())))
				head = head.next;
			else {
				CharacterNode pred = head, tmp = head.next;
				for(; tmp != null && !(tmp.data.getName().equals(character.getName())); pred = pred.next, tmp = tmp.next);
				pred.next = tmp.next;
			}
	}
	
}
