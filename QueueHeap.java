package javaDSA;

import java.util.PriorityQueue;

public class QueueHeap {

	public static void main(String[] args) {
		int[] nums = {5,8,1,3,4,2,6,7,2,9};
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int n : nums) {
			minHeap.add(n);
		}
		System.out.println(minHeap.peek());
		
		while(!minHeap.isEmpty()) {
			System.out.print(minHeap.poll()+" ");
		}
		System.out.println();
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
		for(int n : nums) {
			maxHeap.add(n);
		}
		System.out.println(maxHeap.peek());
		while(!maxHeap.isEmpty()) {
			System.out.print(maxHeap.poll()+" ");
		}
	}

}
