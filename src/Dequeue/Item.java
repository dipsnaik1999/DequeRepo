package Dequeue;

public class Item {
	
	    private int itemId;
	    private int stage;
	    private int priority;
	    private String description;

	    // Constructors
	    public Item(int itemId, int stage, int priority, String description) {
	        this.itemId = itemId;
	        this.stage = stage;
	        this.priority = priority;
	        this.description = description;
	    }

	    // Getters and Setters
	    public int getItemId() {
	        return itemId;
	    }

	    public void setItemId(int itemId) {
	        this.itemId = itemId;
	    }

	    public int getStage() {
	        return stage;
	    }

	    public void setStage(int stage) {
	        this.stage = stage;
	    }

	    public int getPriority() {
	        return priority;
	    }

	    public void setPriority(int priority) {
	        this.priority = priority;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	}

