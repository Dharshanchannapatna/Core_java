package xworkz.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer>pq=new PriorityQueue();
		
		pq.offer(120);
		pq.offer(100);
		pq.offer(1130);
		for(Integer i:pq) {
			System.out.println(i);
		}
			System.out.println("=============");

			System.out.println(pq.poll());
			System.out.println(pq);
		
			System.out.println("=============");
			
			System.out.println(pq.remove());
			System.out.println(pq);
			
			System.out.println("=============");
			
			System.out.println(pq.peek());
			System.out.println(pq);
			
			System.out.println("=============");
			System.out.println(pq.element());
			System.out.println(pq);
			
		}
			
		

}
