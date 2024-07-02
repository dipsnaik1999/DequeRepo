package Dequeue;

	import java.util.ArrayDeque;
	import java.util.Deque;

	public class SimpleStageQueue {
	    private Deque<Item> deque;

	    public SimpleStageQueue() {
	        deque = new ArrayDeque<>();
	    }

	    public void addItem(Item item) {
	        deque.addLast(item);
	    }

	    public Item removeItem() {
	        return deque.pollFirst();
	    }

	    public boolean isEmpty() {
	        return deque.isEmpty();
	    }
	}


