package java04;

import java.util.Scanner;

public class ThreeDigits {
//3�ڸ��� ���� ������ �б�
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x; //�д� ��
		
		do {
			System.out.println("�� �ڸ��� ������: ");
			x = stdIn.nextInt();
		}while (x < 100 || x > 999);
		System.out.println("�Է��� ���� " + x + "�̴�.");
	}

}
