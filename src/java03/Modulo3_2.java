package java03;

import java.util.Scanner;

public class Modulo3_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("������: ");
		int x = stdIn.nextInt();
		System.out.println("���� ��:");
		int y = stdIn.nextInt();

		if (x > 0) {
			if (x % y == 0) {
				System.out.println(x + "����" + y + "���� ����������");
			} else if (x % y == ?????) { //��� ����?
				System.out.println(x + "����" + y + "���� ���������� �ʰ� �������� ????? �̴�.");
			}
								/*
								else if (x % 3 == 2) {
									System.out.println(x + "���� 3���� ���������� �ʰ� �������� 2�̴�.");
								}
								*/
		} else if (x == 0) {
			System.out.println("������ 0���� �Է��ߴ�");
		} else {
			System.out.println("������ ������");
		}
		
	}

}
