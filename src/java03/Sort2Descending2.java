package java03;

import java.util.Scanner;

public class Sort2Descending2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a: ");
		int a = stdIn.nextInt();
		
		System.out.println("���� b: ");
		int b = stdIn.nextInt();
		
		if(a < b ) { //a�� b���� ������
			int t = a; //������ ��ȯ
			a = b;
			b = t;
		}
		System.out.println("a>=b�� �ǵ��� �����Ͽ���.");
		System.out.println("���� a��" + a + "�̴�.");
		System.out.println("���� b��" + b + "�̴�.");
		
	}
	//a�� ���� b���� ������ a�� b�� ���� ��ȯ
	//a�� ���� b���� ũ�� �ƹ��͵� ��������(�������)
	
}
