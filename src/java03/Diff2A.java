package java03;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int x = stdIn.nextInt();
		
		System.out.println("���� b : ");
		int y = stdIn.nextInt();
		
		
		if(x>y) {
			System.out.println("�ΰ��� ����" + (x-y));
		}else if(x<y) {
			System.out.println("�ΰ��� ����" + (y-x));
		}else {
			System.out.println("�� ���� ����");
		}
		
		
	}

}
