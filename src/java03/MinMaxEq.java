package java03;

import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.println("���� b : ");
		int b = stdIn.nextInt();
		
		if(a>b) {
			System.out.println("���� ����" + b + "�̴�.");
			System.out.println("ū ����" + a + "�̴�.");
		}else if(a<b) {
			System.out.println("���� ����" + a + "�̴�.");
			System.out.println("ū ����" + b + "�̴�.");
		}else {
			System.out.println("�� ���� ����.");
		}
		
	}

}
