package com.stackUsingArray;

public class Stack_Array {

	private static int MAX_STACK_SIZE = 10;

	private int top; // stack �� top ��ġ ó������ -1�� �ʱ�ȭ
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

	// �� ���� �׸� ����
	public void push(int element) {
		if (isFull()) {
			System.out.println("stack �� ���� ���ֽ��ϴ�.");
		} else {

			++top;
			data[top] = element;
		}
	}

	// �� ���� ��Ҹ� �����ϰ� ��ȯ
	public int pop() {
		int element;

		if (isEmpty()) {
			System.out.println("stack �� �̹� ����ֽ��ϴ�.");
			return -1; // error return -1
		} else {
			element = data[top];
			--top;
			return element;
		}
	}

	// �������� �ʰ� ��ȯ
	public int peek() {
		if (isEmpty()) {
			System.out.println("stack�� �̹� ����ֽ��ϴ�.");
			return -1;
		} else {
			return data[top];
		}
	}

	// ���� ������ ȭ�鿡 ���
	public void display() {
		if (isEmpty()) {
			System.out.println("stack�� �̹� ����ֽ��ϴ�.");
		} else {
			System.out.println("[stack�� �׸� �� = " + (top + 1) + "] ==> ");

			for (int i = top; i >= 0; i--) {
				System.out.println(data[i]);
			}
		}
	}
}
