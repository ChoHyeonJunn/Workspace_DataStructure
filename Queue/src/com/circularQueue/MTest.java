package com.circularQueue;

public class MTest {

	public static void main(String[] args) {
		CircularQueue que = new CircularQueue();
		
		for (int i = 1; i < 10; i++) {
			que.enqueue(i);
		}
		
	
		que.display();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.display();
		que.enqueue(10);
		que.enqueue(11);
		que.enqueue(12);
		
		que.display();
		
		
		
	}

}
