package java04;

import java.util.Scanner;

public class CountDown {
//���� �������� 0���� ī��Ʈ�ٿ�
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ�. ");
		int a;
		
		do {
			System.out.println("���� ������ : ");
			a = stdIn.nextInt();
		}while(a <= 0);
		
		while(a >= 0)
			System.out.println(--a);
			System.out.println("x�� ����" + a + "�� �Ǿ���.");
	}

}
