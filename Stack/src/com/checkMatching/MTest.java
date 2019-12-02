package com.checkMatching;

import java.util.Scanner;

public class MTest {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StackCheckMatching scm = new StackCheckMatching(10);

		System.out.println("��ȣ �˻� �� ���ڿ� �Է� : ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '<') {
				scm.push(str.charAt(i));
			} else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == '>') {
				if (scm.isEmpty()) {
					System.out.println("����!!");
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
			System.out.println("���� ���� ��ȣ ��Ī �Դϴ�!");
		} else {
			System.out.println("����!!!!");
			scm.display();
		}
	}
}
