package com.stackUsingArray;

public class Stack_Array {

	private static int MAX_STACK_SIZE = 10;

	private int top; // stack 의 top 위치 처음에는 -1로 초기화
	private int[] data = new int[MAX_STACK_SIZE];

	public Stack_Array() {
		top = -1;
	}

	public Stack_Array(int mAX_STACK_SIZE) {
		super();
		MAX_STACK_SIZE = mAX_STACK_SIZE;
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == MAX_STACK_SIZE - 1;
	}

	// 맨 위에 항목 삽입
	public void push(int element) {
		if (isFull()) {
			System.out.println("stack 이 가득 차있습니다.");
		} else {

			++top;
			data[top] = element;
		}
	}

	// 맨 위의 요소를 삭제하고 반환
	public int pop() {
		int element;

		if (isEmpty()) {
			System.out.println("stack 이 이미 비어있습니다.");
			return -1; // error return -1
		} else {
			element = data[top];
			--top;
			return element;
		}
	}

	// 삭제하지 않고 반환
	public int peek() {
		if (isEmpty()) {
			System.out.println("stack이 이미 비어있습니다.");
			return -1;
		} else {
			return data[top];
		}
	}

	// 스택 내용을 화면에 출력
	public void display() {
		if (isEmpty()) {
			System.out.println("stack이 이미 비어있습니다.");
		} else {
			System.out.println("[stack의 항목 수 = " + (top + 1) + "] ==> ");

			for (int i = top; i >= 0; i--) {
				System.out.println(data[i]);
			}
		}
	}
}
