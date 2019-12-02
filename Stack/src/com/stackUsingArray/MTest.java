package com.stackUsingArray;

public class MTest {

	public static void main(String[] args) {
		// 생성자에서 stack의 크기를 10으로 초기화!
		Stack_Array st = new Stack_Array(10);

		for (int i = 1; i < 8; i++) {
			st.push(i);
		}

		System.out.println("stack 에 값을 push 한 후 : \n");
		st.display();

		// top 의 요소를 반환하고 삭제하지 않음
		System.out.println("top = " + st.peek());

		// top 의 요소를 반환하고 삭제
		System.out.println("top = " + st.pop());
		System.out.println("top = " + st.pop());
		System.out.println("top = " + st.pop());

		System.out.println("\nstack 에서 값을 삭제한 후 \n");
		st.display();

	}
}
