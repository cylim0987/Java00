package java04;

import java.util.Scanner;

public class EnumScope {
//2���� �������� �о �� ���� ���̿� �ִ� ��� ������ ���� �ͺ��� ū ������ ǥ��.
//��
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� A : ");
		int x = stdIn.nextInt();
		
		System.out.print("���� B : ");
		int y = stdIn.nextInt();
		
//		x�� ++�ݺ�. y���� ������ ������. �׷��� �װ� ���.
		do {
			if(x < y) {
				x++;
			}else if(x > y) {
				y++;
			}
			
		}while(x == y);
			System.out.println("��� ����.");
	}

}
