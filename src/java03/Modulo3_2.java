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
				System.out.println(x + "����" + y + "���� ���������� ����" + (x/y) + "�̴�." );
			} else if (x % y != 0) {
				System.out.println(x + "����" + y + "���� ���������� �ʰ� ����" + (x/y) + "�̸� ��������" + (x%y) + "�̴�.");
			}
		} else if (x == 0) {
			System.out.println("x������ 0���� �Է��ߴ�");
		} else {
			System.out.println("x������ ������");
		}
		
	}

}
