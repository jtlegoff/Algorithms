package quest3_package2.copy;

public class CharacterNode {
	public Character data;
	public CharacterNode next;
	
	public CharacterNode() {
		next = null;
	}
	
	public CharacterNode(Character el) {
		data = (Character) el;
		next = null;
	}
	
	public CharacterNode(Character el, CharacterNode ptr){
		data = (Character) el;
		next = ptr;
	}
}
