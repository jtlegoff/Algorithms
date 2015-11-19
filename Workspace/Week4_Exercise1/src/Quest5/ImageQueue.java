package Quest5;

public class ImageQueue {

		private java.util.LinkedList<Image> queue = new java.util.LinkedList<Image>();
		
		public ImageQueue(){
			
		}
		
		public void clear(){
			queue.clear();
		}
		
		public boolean isEmpty(){
			return queue.isEmpty();
		}
		
		public Object firstEL(){
			return queue.getFirst();
		}
		
		public Object dequeue(){
			return queue.removeFirst();
		}
		
		public void enqueue(Image el){
			queue.addLast(el);
		}
		
		public String toString(){
			return queue.toString();
		}

}
