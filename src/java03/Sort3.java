package java03;

import java.util.Scanner;

//3���� �������� ��������(���� ��)���� �����ϴ� ���α׷� �ۼ�

//����
public class Sort3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a: ");
		int a = stdIn.nextInt();
		System.out.println("���� b: ");
		int b = stdIn.nextInt();
		System.out.println("���� c: ");
		int c = stdIn.nextInt();
		
		if(a > b) { //a��b���� ũ��...
			int t = a;
			a = b;
			b = t;
			if(b > c) {
				int q = b;
				b = c;
				c = q;
				System.out.println("a<=b<=c�� �ǵ��� ����.");
				System.out.println("������ a��" + a);
				System.out.println("������ b��" + b);
				System.out.println("������ c��" + c);
			}
			
		}
		
		
	}

}
