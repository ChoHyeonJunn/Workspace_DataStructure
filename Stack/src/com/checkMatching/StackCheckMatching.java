package com.checkMatching;

public class StackCheckMatching {

	private static int MAX_STACK_SIZE = 10;

	private int top; // stack �� top ��ġ ó������ -1�� �ʱ�ȭ
	private char[] data = new char[MAX_STACK_SIZE];

	public StackCheckMatching() {
		top = -1;
	}

	public StackCheckMatching(int mAX_STACK_SIZE) {
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
	public void push(char element) {
		if (isFull()) {
			System.out.println("stack �� ���� ���ֽ��ϴ�.");
		} else {

			++top;
			data[top] = element;
		}
	}

	// �� ���� ��Ҹ� �����ϰ� ��ȯ
	public char pop() {
		char element;

		if (isEmpty()) {
			System.out.println("stack �� �̹� ����ֽ��ϴ�.");
			return ' '; // error return -1
		} else {
			element = data[top];
			--top;
			return element;
		}
	}

	// �������� �ʰ� ��ȯ
	public char peek() {
		if (isEmpty()) {
			System.out.println("stack�� �̹� ����ֽ��ϴ�.");
			return ' ';
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
