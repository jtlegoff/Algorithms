package Bonus;

public class PlayerBST {

	protected PlayerNode root;
	
	public PlayerBST(){
		root = null;
	}
	
	protected void visit(PlayerNode p){
		System.out.print(p.player.getLevel() + " ");
	}
	
	public void insert(Player el){
		PlayerNode p = root;
		PlayerNode prev = null;
		
		while (p != null){
			prev = p;
			if(p.player.getLevel() < el.getLevel())
				p = p.right;
			else
				p = p.left;
		}
		
		if(root == null)
			root = new PlayerNode(el);
		else if(prev.player.getLevel() < el.getLevel())
			prev.right = new PlayerNode(el);
		else
			prev.left = new PlayerNode(el);
	}
	
	public PlayerNode search (PlayerNode p, Player el){
		while (p != null){
			if(el.getLevel() == p.player.getLevel())
				return p;
			else if (el.getLevel() < p.player.getLevel())
				p = p.left;
			else
				p = p.right;
		}
		return null;
	}
	
	public void breadthFirst(){
		PlayerNode p = root;
		Queue queue = new Queue();
		
		if(p != null){
			queue.enqueue(p);
			while(!queue.isEmpty()){
				p = (PlayerNode) queue.dequeue();
				visit(p);
				if(p.left != null)
					queue.enqueue(p.left);
				if(p.right != null)
					queue.enqueue(p.right);
			}
		}
	}
	
	protected void inorder(PlayerNode p){
		if(p != null){
			inorder(p.left);
			visit(p);
			inorder(p.right);
		}
	}
	
	public void deleteByMerging(Player el){
		PlayerNode tmp, node, p = root, prev = null;
		
		while (p != null && p.player.getLevel() != el.getLevel()){
			prev = p;
			if(p.player.getLevel() < el.getLevel())
				p = p.right;
			else
				p = p.left;
		}
		
		node = p;
		
		if(p != null && p.player.getLevel() == el.getLevel()){
			if(node.right == null)
				node = node.left;
			
			else if(node.left == null)
				node = node.right;
			
			else {
				tmp = node.left;
				while (tmp.right != null)
					tmp = tmp.right;
				
				tmp.right = node.right;
				node = node.left;
			}
			
			if(p == root)
				root = node;
			else if (prev.left == p)
				prev.left = node;
			else
				prev.right = node;
		}
		else if(root != null)
			System.out.println("key " + el.getLevel() + " is not in the tree");
		else
			System.out.println("the tree is empty");
			
	}
}





