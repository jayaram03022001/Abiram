import java.util.*;
public class QueueExample {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	                locationsQueue.add("Tamil Nadu");
	        		locationsQueue.add("Patna");
	        		locationsQueue.add("Delhi");
	        		locationsQueue.add("Kerala");
	        		locationsQueue.add("Karnataka");
	                System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
	}

