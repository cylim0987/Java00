package java01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� ���մϴ�.");
		
		System.out.println("�غ� : ");
		double x = stdIn.nextDouble();

		System.out.println("���� : ");
		double y = stdIn.nextDouble();
		
		System.out.println("���̴� : " + ((x*y)/2));
		
		
	}

}
