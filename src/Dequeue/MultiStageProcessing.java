package Dequeue;

	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public class MultiStageProcessing {

	    public static void main(String[] args) throws InterruptedException {
	        // Create stages with appropriate queue implementations
	        StageQueue stage1 = new StageQueue();
	        BlockingStageQueue stage2 = new BlockingStageQueue();
	        ConcurrentStageQueue stage3 = new ConcurrentStageQueue();
	        SimpleStageQueue stage4 = new SimpleStageQueue();

	        // Sample items to process
	        Item item1 = new Item(1, 1, 1, "Item 1");
	        Item item2 = new Item(2, 1, 2, "Item 2");
	        Item item3 = new Item(3, 2, 1, "Item 3");
	        Item item4 = new Item(4, 3, 1, "Item 4");

	        // Add items to respective stages
	        stage1.addItem(item1);
	        stage1.addItem(item2);
	        stage2.addItem(item3);
	        stage3.addItem1(item4);

	        // Example thread pool to process stages concurrently
	        ExecutorService executor = Executors.newFixedThreadPool(4);

	        // Process items in each stage concurrently
	        executor.submit(() -> processStage(stage1));
	        executor.submit(() -> {
	            try {
	                processBlockingStage(stage2);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });
	        executor.submit(() -> processStage(stage3));
	        executor.submit(() -> processStage(stage4));

	        // Shutdown the executor after tasks are complete
	        executor.shutdown();
	    }

	    private static Object processStage(SimpleStageQueue stage4) {
			// TODO Auto-generated method stub
			return null;
		}

		private static Object processStage(ConcurrentStageQueue stage3) {
			// TODO Auto-generated method stub
			return null;
		}

		// Process items in a non-blocking stage
	    private static void processStage(StageQueue stage) {
	        while (!stage.isEmpty()) {
	            Item item = stage.removeItem();
	            System.out.println("Processing item " + item.getItemId() + " in Stage " + item.getStage());
	            // Processing logic here
	        }
	    }

	    // Process items in a blocking stage
	    private static void processBlockingStage(BlockingStageQueue stage) throws InterruptedException {
	        while (!stage.isEmpty()) {
	            Item item = stage.removeItem();
	            System.out.println("Processing item " + item.getItemId() + " in Stage " + item.getStage());
	            // Processing logic here
	        }
	    }
	}


