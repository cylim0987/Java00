package java04;

import java.util.Scanner;

public class EnumScope2 {
//2���� �������� �о �� ���� ���̿� �ִ� ��� ������ ���� �ͺ��� ū ������ ǥ��.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� A : ");
		int x = stdIn.nextInt();
		
		System.out.print("���� B : ");
		int y = stdIn.nextInt();
		
		if(x>y) {
			int t = x;
			x = y;
			y = t;
		}
//		do {
//			System.out.print(x + " ");
//			x = x + 1;
//			
//		}while(x <= y);
//		System.out.println();
		
		do {
			System.out.print((x++) + " ");
		}while(x <= y);
		System.out.println();
		
		
	}
}
