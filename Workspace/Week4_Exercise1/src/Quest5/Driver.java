package Quest5;

import Exercise2.Queue;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageQueue queue = new ImageQueue();
		queue.enqueue(new Image("Batman", "1080 x 1920"));
		queue.enqueue(new Image("Superman", "1080 x 1920"));
		queue.enqueue(new Image("Link", "1080 x 1920"));
		queue.enqueue(new Image("Zelda", "1080 x 1920"));
		queue.enqueue(new Image("Goku", "1080 x 1920"));
		System.out.println(((Image)queue.firstEL()).getName() + "'s resolution is " 
				+ ((Image)queue.firstEL()).getResolution());
		queue.dequeue();
		queue.dequeue();
		System.out.println(((Image)queue.firstEL()).getName() + "'s resolution is " 
				+ ((Image)queue.firstEL()).getResolution());
	}

}
