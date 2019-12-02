package com.checkMatching;

import java.util.Scanner;

public class MTest {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StackCheckMatching scm = new StackCheckMatching(10);

		System.out.println("괄호 검사 할 문자열 입력 : ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '<') {
				scm.push(str.charAt(i));
			} else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == '>') {
				if (scm.isEmpty()) {
					System.out.println("오류!!");
					scm.display();
					return;
				} else {
					char now = scm.pop();

					if ((str.charAt(i) == ')' && now != '(') || (str.charAt(i) == '}' && now != '{')
							|| (str.charAt(i) == ']' && now != '[') || (str.charAt(i) == '>' && now != '<')) {
						break;
					}
				}
			}
		}

		if (scm.isEmpty()) {
			System.out.println("오류 없는 괄호 매칭 입니다!");
		} else {
			System.out.println("오류!!!!");
			scm.display();
		}
	}
}
