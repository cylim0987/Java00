package java03;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("������: ");
		int x = stdIn.nextInt();

		if (x > 0) {
			if (x % 3 == 0) {
				System.out.println(x + "���� 3���� ���������ϴ�.");
			} else if (x % 3 == 1) {
				System.out.println(x + "���� 3���� ���������� �ʰ� �������� 1�̴�.");
			} else if (x % 3 == 2) {
				System.out.println(x + "���� 3���� ���������� �ʰ� �������� 2�̴�.");
			}

		} else if (x == 0) {
			System.out.println("������ 0���� �Է��ߴ�");
		} else {
			System.out.println("������ ������");
		}
	}
}
