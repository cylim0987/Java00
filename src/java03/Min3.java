package java03;

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� a: ");
		int x = stdIn.nextInt();
		
		System.out.println("���� b: ");
		int y = stdIn.nextInt();
		
		System.out.println("���� c: ");
		int z = stdIn.nextInt();
		
		int min = x;
		
		if(y<min) {
			min = y;
		}
		if(z<min) {
			min = z;
		}
		
		System.out.println("�ּҰ��� " + min + "�̴�.");
		
	}

	//'�˰���' : ������ �ذ��ϱ� ���� ������, ��Ȯ�ϰ� ���ǵǾ� ������ ������ ������ �ִ� ���� ���� ��Ģ���� ����...
}
