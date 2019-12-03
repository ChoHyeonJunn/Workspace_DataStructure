package com.circularQueue;

public class CircularQueue {

	private static final int MAX_QUEUE_SIZE = 10;

	protected int front;
	protected int rear;
	protected int data[] = new int[MAX_QUEUE_SIZE];

	public CircularQueue() {
		this.front = 0;
		this.rear = 0;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("queue가 가득 차있습니다.");
		} else {
			rear = (rear + 1) % MAX_QUEUE_SIZE;
			data[rear] = item;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("queue가 비어있습니다.");
			return -1;
		} else {
			front = (front + 1) % MAX_QUEUE_SIZE;
			return data[front];
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("queue가 비어있습니다.");
			return -1;
		} else {
			int tmpFront = (front + 1) % MAX_QUEUE_SIZE;
			return data[tmpFront];
		}
	}

	public boolean isEmpty() {
		return front == rear; // front와 rear의 위치가 같다면 공백 상태
	}

	public boolean isFull() {
		return front == ((rear + 1) % MAX_QUEUE_SIZE);
	}

	public void display() {
		int maxq = (front < rear) ? rear : rear + MAX_QUEUE_SIZE;

		System.out.println("display queue !!");
		for (int i = front + 1; i <= maxq; i++) {
			System.out.print((data[i % MAX_QUEUE_SIZE]) + " ");
		}
		System.out.println();

//		for (int i = (front + 1) % MAX_QUEUE_SIZE; i <= rear; i = (i + 1) % MAX_QUEUE_SIZE) {
//			System.out.println(i + " ");
//		}
	}
}
