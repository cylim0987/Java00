package java01;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {

		Scanner stringName = new Scanner(System.in);
		
		System.out.println("��: ");
		String x = stringName.next();

		System.out.println("�̸�: ");
		String y = stringName.next();
		
		System.out.println("�ȳ��ϼ���. " + (x+y) + "��.");
		
	}

}
