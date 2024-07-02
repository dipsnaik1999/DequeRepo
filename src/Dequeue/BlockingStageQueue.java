package Dequeue;

	import java.util.concurrent.BlockingDeque;
	import java.util.concurrent.LinkedBlockingDeque;

	public class BlockingStageQueue {
	    private BlockingDeque<Item> deque;

	    public BlockingStageQueue() {
	    	//Constructs
	        deque = new LinkedBlockingDeque<>();
	    }

	    public void addItem(Item item) throws InterruptedException {
	    	//Adds an item to the queue
	        deque.putLast(item);
	    }

	    public Item removeItem() throws InterruptedException {
	    	//Retrieves and removes the item at the front of the queue
	        return deque.takeFirst();
	    }

	    public boolean isEmpty() {
	    	//Checks if the queue is empty
	    	//return True if the queue is empty, otherwise false
	        return deque.isEmpty();
	    }
	}


