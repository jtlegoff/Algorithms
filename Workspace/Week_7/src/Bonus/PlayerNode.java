package Bonus;

public class PlayerNode {

	protected Player player;
	protected PlayerNode left;
	protected PlayerNode right;
	
	public PlayerNode(){
		left = right = null;
	}
	
	public PlayerNode(Player el){
		this(el, null, null);
	}
	
	public PlayerNode(Player el, PlayerNode lt, PlayerNode rt){
		player = el;
		left = lt;
		right = rt;
	}
}
