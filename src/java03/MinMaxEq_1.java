package java03;

import java.util.Scanner;

public class MinMaxEq_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a : ");
		int a = stdIn.nextInt();
		
		System.out.println("���� b : ");
		int b = stdIn.nextInt();
		
		if(a == b) {
			System.out.println("�� ���� ����.");
		}else {
			int min, max;
			if(a < b) {
				min = a;
				max = b;
			}
			else {
				min = b;
				max = a;
			}
			System.out.println("���� ����" + min );
			System.out.println("ū ����" + max );
			
		}
		
	}

}
