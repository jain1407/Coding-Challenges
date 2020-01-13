Minimum cost to connect sticks
You have some sticks with positive integer length and you can connect two sticks X and Y
by a cost of X+Y. Find the minimum cost of the sticks

Example 1
Input: sticks = {2,4,3}
Cost = 14




import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {2,4,3};
		int testing = connectSticks(test);
		System.out.println("The minimum cost to connect these sticks is " + testing);
	}

	
	public static int connectSticks(int[] sticks) {
		// An approach to solving this problem is by a greedy method of always
		// combining the smallest sticks first. 
		// Method to implement: Using a min-heap which stores all of these sticks
		// We pull out sticks from the min-heap and add them to get a cost and 
		// then insert that larger stick in the heap and reheapify
		int cost = 0; 
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		// Add all sticks to the heap
		for(int stick: sticks)
			minHeap.add(stick);
		
		System.out.println(minHeap);
		
		while(minHeap.size() != 1) {
			int stick1 = minHeap.poll();
			System.out.println(minHeap);
			int stick2 = minHeap.poll();
			System.out.println(minHeap);
			cost += stick1+stick2;
			System.out.println(cost);
			minHeap.add(stick1+stick2);
			System.out.println(minHeap);
		}
		return cost;
	}
}
