package com.stackUsingArray;

public class MTest {

	public static void main(String[] args) {
		// �����ڿ��� stack�� ũ�⸦ 10���� �ʱ�ȭ!
		Stack_Array st = new Stack_Array(10);

		for (int i = 1; i < 8; i++) {
			st.push(i);
		}

		System.out.println("stack �� ���� push �� �� : \n");
		st.display();

		// top �� ��Ҹ� ��ȯ�ϰ� �������� ����
		System.out.println("top = " + st.peek());

		// top �� ��Ҹ� ��ȯ�ϰ� ����
		System.out.println("top = " + st.pop());
		System.out.println("top = " + st.pop());
		System.out.println("top = " + st.pop());

		System.out.println("\nstack ���� ���� ������ �� \n");
		st.display();

	}
}
