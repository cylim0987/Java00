package java03;

import java.util.Scanner;
//3���� �������� ��������(���� ��)���� �����ϴ� ���α׷� �ۼ�
public class Sort3_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a: ");
		int a = stdIn.nextInt();
		System.out.println("���� b: ");
		int b = stdIn.nextInt();
		System.out.println("���� c: ");
		int c = stdIn.nextInt();
		
		if(a > b) { //a��b���� ũ��...a�� b�� ��ȯ
			int t = a;
			a = b;
			b = t;
		}
		if(b > c) {
			int t = b;
			b = c;
			c = t;
		}
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		
		System.out.println("a<=b<=c�� �ǵ��� ����.");
		System.out.println("������ a��" + a);
		System.out.println("������ b��" + b);
		System.out.println("������ c��" + c);
			
		
		
	}

}
