package Dequeue;

	import java.util.concurrent.ConcurrentLinkedDeque;

	public class ConcurrentStageQueue {
	    private ConcurrentLinkedDeque<Item> deque;

	    public ConcurrentStageQueue() {
	        deque = new ConcurrentLinkedDeque<>();
	    }

	    public void addItem1(Item item) {
	        deque.addLast(item);
	    }

	    public Item removeItem() {
	        return deque.pollFirst();
	    }

	    public boolean isEmpty() {
	        return deque.isEmpty();
	    }

	
			
		}
	


