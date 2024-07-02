package Dequeue;

	import java.util.Deque;
	import java.util.LinkedList;

	public class StageQueue {
	
	    private final Deque<Item> deque;

	    public StageQueue() {
	    	
	        this.deque = new LinkedList<>();
	    }

	    public void addItem(Item item) { 
	    	//Adds an item to the queue
	        deque.addLast(item);
	    }

	    public Item removeItem() {  
	    	//Retrieves and removes the item at the front of the queue
	        return deque.pollFirst();
	    }

	    public  boolean isEmpty() {  
	    	// Checks if the queue is empty or return True if the queue is empty, otherwise false
	        return deque.isEmpty();
	    }
	}

